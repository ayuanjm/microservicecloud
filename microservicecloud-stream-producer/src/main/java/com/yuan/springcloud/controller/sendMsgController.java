package com.yuan.springcloud.controller;

import com.atguigu.springcloud.listener.MyQueue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author yuan
 */
@RestController
@Slf4j
@EnableBinding({MyQueue.class})
public class sendMsgController {
    @Autowired
    private MyQueue queue;

    /**
     * 生产者流程
     * 1 创建消息发送通道
     * 2 生产投递消息（生产者往通道中发送消息）
     * 3 开启绑定（结合）@EnableBinding()
     *
     * @return
     */
    @RequestMapping("sendMsg")
    public String sendMsg() {
        String msg = UUID.randomUUID().toString();
        log.info("生产者发送内容msg:{}", msg);
        Message build = MessageBuilder.withPayload(msg).build();
        queue.output().send(build);
        return "success";
    }
}

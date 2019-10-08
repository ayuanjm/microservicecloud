package com.yuan.springcloud.listener;

import com.atguigu.springcloud.listener.MyQueue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author yuan
 */
@Component
@Slf4j
@EnableBinding(MyQueue.class)
public class Consumer {
    @Value("${server.port}")
    private String serverPort;

    /**
     * StreamListener value 是一个bean实例（@Output，@Input的value）,而不是根据"字符串名字"。
     * StreamListener 监听的是消费者input管道实例,需要与生产者端的output管道实例一致。
     *
     * @param msg
     */
    @StreamListener(MyQueue.CHANNEL_OUTPUT)
    public void redMsg(String msg) {
        log.info("消费者获取到生产者投递的消息serverPort:{},msg:{}", serverPort, msg);
    }
}

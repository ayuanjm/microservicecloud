package com.yuan.springcloud.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author yuan
 */
@Component
@Slf4j
public class Consumer {
    @Value("${server.port}")
    private String serverPort;
    @StreamListener("my_stream_channel")
    public void redMsg(String msg) {
        log.info("消费者获取到生产者投递的消息serverPort:{},msg:{}", serverPort,msg);
    }
}

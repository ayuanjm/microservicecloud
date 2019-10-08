package com.yuan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 消息生产者
 * @author yuan
 */
@SpringBootApplication
public class StreamAppProducer {
    public static void main(String[] args) {
        SpringApplication.run(StreamAppProducer.class, args);
    }
}

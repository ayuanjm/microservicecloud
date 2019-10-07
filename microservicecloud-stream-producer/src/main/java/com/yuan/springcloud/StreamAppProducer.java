package com.yuan.springcloud;

import com.yuan.springcloud.stream.SendMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(SendMessage.class)
public class StreamAppProducer {
    public static void main(String[] args) {
        SpringApplication.run(StreamAppProducer.class, args);
    }
}

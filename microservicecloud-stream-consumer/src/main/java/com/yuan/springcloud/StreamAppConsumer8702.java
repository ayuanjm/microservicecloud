package com.yuan.springcloud;

import com.yuan.springcloud.stream.RedMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(RedMessage.class)
public class StreamAppConsumer8702 {
    public static void main(String[] args) {
        SpringApplication.run(StreamAppConsumer8702.class, args);
    }
}

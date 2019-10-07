package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yuan
 * 是一个Eureka服务
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaService7002_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService7002_App.class, args);
    }
}
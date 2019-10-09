package com.atguigu.springcloud.listener;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author yuan
 * 消息通道
 */
public interface MyQueue {
    String CHANNEL_OUTPUT = "channel_output";
    String CHANNEL_INPUT = "channel_input";

    /**
     * 创建发送消息通道
     *
     * @return
     */
    @Output(MyQueue.CHANNEL_OUTPUT)
    MessageChannel output();

    /**
     * 消费者消息通道
     *
     * @return
     */
    @Input(MyQueue.CHANNEL_INPUT)
    SubscribableChannel input();
}

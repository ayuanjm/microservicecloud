package com.yuan.springcloud.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * 消息提供者
 *
 * @author yuan
 */
public interface SendMessage {
    String OUT_PUT = "my_stream_channel";
    /**
     * 创建发送消息通道
     * @return
     */
    @Output("my_stream_channel")
    SubscribableChannel sendMsg();
}

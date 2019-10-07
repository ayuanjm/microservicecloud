package com.yuan.springcloud.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface RedMessage {
    @Input("my_stream_channel")
    SubscribableChannel redMsg();
}

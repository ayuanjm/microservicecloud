package com.atguigu.springcloud.listener;

import com.netflix.appinfo.InstanceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author yuanjm
 * @date 2020/8/7 5:53 下午
 */
@Slf4j
@Component
public class EurekaStateListener {
    //private final static Logger logger = LoggerFactory.getLogger(EurekaStateListener.class);

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        log.info("服务{}已下线", event.getAppName());
        log.info("server地址信息{}", event.getServerId());
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        log.info("服务{}进行注册", instanceInfo.getAppName() + instanceInfo.getHostName() + "  " + instanceInfo.getIPAddr() + "  " + instanceInfo.getPort());
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        log.info("服务{}进行续约", event.getServerId() + "  " + event.getAppName());
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        log.info("注册中心启动,{}", System.currentTimeMillis());
    }

    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        log.info("注册中心服务端启动,{}", System.currentTimeMillis());
    }
}

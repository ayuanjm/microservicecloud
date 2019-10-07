package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yuan
 */
@Configuration
public class ConfigBean {
    /**
     * 默认轮询负载均衡算法，如果有其他算法存在则代替默认算法
     *
     * @return
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * 用重新选择的随机算法代替默认的轮询
     *
     * @return
     */
    @Bean
    public IRule myRule() {
//        return new RandomRule();
        return new RetryRule();
    }
}

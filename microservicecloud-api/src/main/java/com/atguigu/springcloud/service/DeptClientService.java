package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * @Description: 修改microservicecloud-api工程，根据已经有的DeptClientService接口
 * 一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory
 * 服务熔断降级都会调用fallback = DeptClientException.class 里的方法
 * feign.hystrix.enabled=true
 *
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallback = DeptClientException.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept);

}

package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientException implements DeptClientService {

    @Override
    public Dept get(long id) {
    	System.out.println("===================");
        return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                .setDb_source("no this database in MySQL");
    }

    @Override
    public List<Dept> list() {
        return null;
    }

    @Override
    public boolean add(Dept dept) {
        return false;
    }
}

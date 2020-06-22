package com.fc.feign.impl;

import com.fc.entity.Student;
import com.fc.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/*
* 熔断器
* */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}

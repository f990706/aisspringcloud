package com.fc.controller;

import com.fc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    //通过resttemplate去服务提供者取信息
    private RestTemplate restTemplate;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        //可以直接用provider代替localhost：8010，因为他是直接从注册中心取
        return restTemplate.getForObject("http://provider/student/findAll",Collection.class);
    }
    //改变端口以便直观的观察出负载均衡
    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/student/index",String.class);
    }
}

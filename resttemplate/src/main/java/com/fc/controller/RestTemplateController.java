package com.fc.controller;

import com.fc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class RestTemplateController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        //最后一个返回值类型不清楚如何写。写null报错，写void。class也有错，但是可以运行
        restTemplate.postForObject("http://localhost:8010/student/save",student,void.class);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update",student);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){
        restTemplate.delete("http://localhost:8010/student/delete/{id}",id);
    }
}

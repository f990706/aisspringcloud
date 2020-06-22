package com.fc.controller;

import com.fc.entity.Student;
import com.fc.service.serviceImpl.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImp studentServiceImp;

    @Value("${server.port}")
    private String port;//获取当前端口
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentServiceImp.findAll();
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentServiceImp.save(student);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentServiceImp.update(student);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){
        studentServiceImp.deleteById(id);
    }
    @GetMapping("/index")
    public String index(){
        return "当前服务端口是："+this.port;
    }
}

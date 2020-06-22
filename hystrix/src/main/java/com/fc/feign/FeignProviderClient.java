package com.fc.feign;

import com.fc.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

//fallback代表降级处理（出现错误就进行熔断）
@FeignClient(value = "provider")
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
    @GetMapping("/student/index")
    public String index();
}

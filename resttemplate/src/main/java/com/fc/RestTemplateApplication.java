package com.fc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class,args);
    }
    /*
     * 使用spring提供的RestTemplate发送http请求到商品服务
     * 1.创建RestTemplate对象交给容器管理
     * 2.在使用的时候，调用其它方法完成
     * */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

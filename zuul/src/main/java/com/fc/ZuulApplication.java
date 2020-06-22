package com.fc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//生成代理，包含了@EnableZuulServer，设置该类是网关的启动类
@EnableZuulProxy
//自动装载配置，可以帮助Springboot应用将所有符合条件的@Configuration配置加载到SpringBoot创建并使用的IOC容器
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}

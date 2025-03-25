package com.zlc.springsecurity_example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.zlc.springsecurity_example.mapper")
public class SpringsecurityExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityExampleApplication.class, args);
    }

}

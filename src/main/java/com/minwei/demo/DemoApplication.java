package com.minwei.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
@MapperScan(basePackages = "com.minwei.demo")
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(DemoApplication.class, args);
    }

}


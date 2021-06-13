package com.example.blogsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.blogsystem.dao")
@SpringBootApplication
public class BlogsystemApplication {

    public static void main(String[] args) {
        System.out.println("Hello Springboot!");
        SpringApplication.run(BlogsystemApplication.class, args);
    }

}

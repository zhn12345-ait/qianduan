package com.iflytek;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//@SpringBootApplication 项目启动类
@SpringBootApplication
//@EnableSwagger2开启swagger配置
@EnableSwagger2
public class Main {
    public static void main(String[] args) {

       SpringApplication.run(Main.class,args);
    }
}
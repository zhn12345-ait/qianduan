package com.iflytek.controller;

import com.iflytek.entity.User;
import com.iflytek.entity.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//声明Conroller注解
@RestController
//@RestController=@controller+@ResponseBody
//@PropertySource注解，设置配置文件路径
@PropertySource("classpath:person.properties")
public class DemoController {
    @Value("${name2}")
    private String nameNew;
    @Value("${name1}")
    private String name1;
    //@Autowired注解：springboot自动装配
    @Autowired
    User user;
    @Autowired
    Environment environment;
    @Autowired
    User1 user1;
//    声明请求路径
    @RequestMapping("/index")
    public  String index(){
        System.out.println(environment.getProperty("user.name"));
        System.out.println(environment.getProperty("user.name123","admin"));
        System.out.println( user1.toString());
//        System.out.println(nameNew);
//        System.out.println(name1);
        return "Hello SpringBoot!";
    }
}

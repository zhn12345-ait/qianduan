package com.iflytek.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Data注解 使用lombook依赖包，自动完成get set toString 等方法
@Data
//@Component注解，将当前类注册到Spring中
@Component
//@ConfigurationProperties注解：批量获取数据
@ConfigurationProperties(prefix = "person")

public class User1 {
//属性名要与配置文件中对象属性一一对应
    private String name;

    private int age;

    private String likes;

//    public static void main(String[] args) {
//        User user = new User();
//        user.setName("小丸子");
//        System.out.println(user.getName());
//    }
}

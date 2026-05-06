package com.iflytek.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
//@TableName数据库中对应的表名
@TableName("user")
@Component
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}

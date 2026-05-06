package com.iflytek.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
//@Api：用在请求的类上，表示对类的说明 tags="说明该类的作用，可以在UI界面上看到的注解"
@Api(tags="测试控制器")
public class TestController {
//    @ApiOperation用在请求的方法上，说明方法的用途、作用 value="说明方法的用途、作用 notes="方法的备注说明"
    @ApiOperation(value="get方法",notes = "获取用户信息")
    @GetMapping("/get1")
//    @ApiParam(value="用户名") 参数介绍
//    @RequestParam请求参数映射
    public String get(@ApiParam(value="用户名") @RequestParam(value="name") String name){
        System.out.println("参数name"+name);
        return "String value ...";
    }
    @PostMapping("/post")
    public void post(@ApiParam(value="用户名")  @RequestBody String name){
        System.out.println("参数name:"+name);
        System.out.println("post请求！");
    }
}

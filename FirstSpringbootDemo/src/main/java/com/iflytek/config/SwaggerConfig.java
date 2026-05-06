package com.iflytek.config;


import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

//@Configuration标识一个配置类
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket docket() {
        //创建Docket对象
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        //定义作者信息
        Contact contact = new Contact("wrl", "http://www.ccsfu.edu.cn", "286843051@qq.com");
        //定义Api信息(方法1)
        ApiInfo apiInfo = new ApiInfo("商城后端API文档",
                "说明文档", "1.1",
                "",
                contact,
                "",
                "",
                new ArrayList<VendorExtension>());
        // 定义Api信息(方法2)
        // ApiInfo apiInfo = new ApiInfoBuilder().title("商城后端API文档").contact(contact).description("前后端分离必不可少的工具").build();

        //设置api信息
        docket.apiInfo(apiInfo)
                .select()
                // 对所有api进行监控
                .apis(RequestHandlerSelectors.any())
                //不显示错误的接口地址
                .paths(Predicates.not(PathSelectors.regex("/error.*")))//错误路径不监控
                //扫描所有的包 可以扫描指定的包.apis(RequestHandlerSelectors.basePackage("com.iflytek.springbootdemo3.conroller"))
                .paths(PathSelectors.any())
                .build();

        return docket;
    }
}

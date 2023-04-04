package com.ahzx.hndctservice.common.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * Swagger配置类 *
 * @Author xiehd
 * @Date 2023 03 29
 **/
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket webApiConfig(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("webApi").apiInfo(webApiInfo()).select()
                //只显示api路径下的页面
                .paths(Predicates.and(PathSelectors.regex("/api/.*")))
                .build();
    }

    private ApiInfo webApiInfo(){
        return new ApiInfoBuilder().title("采集端-API文档").description("本文档描述了海南涉农信用信息数据库采集端接口定义").version("1.0")
//                .contact(new Contact("Atguigu", "http://atguigu.com", "xg114747411@126.com"))
                .build();
    }


    //配置了Swagger 的  Docket的bean的实例
    @Bean
    public Docket docket(Environment environment){
        //设置要显示的Swagger环境
        Profiles profiles= Profiles.of("dev","test");

        //通过environment.acceptsProfiles判断是否处在自己设定的环境当中
        boolean flag = environment.acceptsProfiles(profiles);


        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(flag)//enable是否启动Swagger,如果为false,则swagger不能在再浏览器中访问
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ahzx.hndctservice.controller"))
                // .paths(PathSelectors.ant("/kuang/**"))
                .build();
    }

    //配置swagger信息=apiInfo
    private ApiInfo apiInfo(){
        //作者信息
        Contact contact= new Contact("我是一只小仓鼠","https://demo.com/","134@");
        return new ApiInfo(
                "练习的Swagger文档",
                "即使再小的帆也能远航",
                "1.0",
                "https://demo.com/",
                contact,
                "Apache2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>());
    }




//    @Bean
//    public Docket adminApiConfig(){
//        return new Docket(DocumentationType.SWAGGER_2).groupName("adminApi").apiInfo(adminApiInfo()).select()
//                //只显示admin路径下的页面
//                .paths(Predicates.and(PathSelectors.regex("/admin/.*")))
//                .build();
//    }
//
//    private ApiInfo adminApiInfo(){
//        return new ApiInfoBuilder().title("后台管理系统-API文档").description("本文档描述了后台管理系统微服务接口定义").version("1.0")
////                .contact(new Contact("Atguigu", "http://atguigu.com", "xg114747411@126.com"))
//                .build();
//    }
}

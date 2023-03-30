package com.ahzx.hndctservice.common.config;

import com.google.common.base.Predicates;
import springfox.documentation.service.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

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

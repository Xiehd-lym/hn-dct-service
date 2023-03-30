package com.ahzx.hndctservice.common.config;

import com.ahzx.hndctservice.common.interceptor.UserLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 注册自定义拦截器 *
 * @Author xiehd
 * @Date 2023 03 28
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册 registration 拦截器
//        InterceptorRegistration registration = registry.addInterceptor(new UserLoginInterceptor());
//
//        // 拦截所有的路径
//        registration.addPathPatterns("/**");
//
//        // 添加不拦截路径 /api/user/login 是登录的请求, /api/user/register 注册的请求
//        registration.excludePathPatterns(
//                "/api/**",
//                // html 静态资源
//                "/**/*.html",
//                // js 静态资源
//                "/**/*.js",
//                // css 静态资源
//                "/**/*.css",
//                "/swagger-resources/**",
//                "/swagger-ui.html/**"
//        );
    }

}

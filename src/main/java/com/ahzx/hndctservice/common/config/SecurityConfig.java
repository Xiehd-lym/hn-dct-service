package com.ahzx.hndctservice.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 配置只有"11.11.11.11"地址的用户可以访问“/foos”的资源。使用白名单IP的用户在访问“/foos/”URL之前也不需要登录
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/foos/**").hasIpAddress("11.11.11.11")
                .anyRequest().authenticated()
                .and()
                .formLogin().permitAll()
                .and()
                .csrf().disable();

        // 将登录框关闭
        http.formLogin().disable();
    }

    /**
     * 如果需要先登录，那么配置表达式如下
     *
     * .antMatchers("/foos/**")
     * .access("isAuthenticated() and hasIpAddress('11.11.11.11')")
     *
     */
}

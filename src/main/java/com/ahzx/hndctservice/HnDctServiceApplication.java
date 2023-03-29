package com.ahzx.hndctservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Springboot 启动类 *
 * @Author xiehd
 * @Date 2023 03 28
 **/
@Slf4j
@SpringBootApplication
public class HnDctServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HnDctServiceApplication.class, args);
        log.info("项目启动成功");
    }

}

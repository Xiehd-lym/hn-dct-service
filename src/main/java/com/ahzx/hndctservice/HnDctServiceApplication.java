package com.ahzx.hndctservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class HnDctServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HnDctServiceApplication.class, args);
        log.info("项目启动成功");
    }

}

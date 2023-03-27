package com.ahzx.hndctservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@Slf4j
@SpringBootApplication
@MapperScan("com.ahzx.hndctservice.mapper")// 需要将继承的Mapper接口添加到Mybatis配置中
public class HnDctServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HnDctServiceApplication.class, args);
        log.info("项目启动成功");
    }

}

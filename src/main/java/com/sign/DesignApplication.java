package com.sign;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.sign.mapper")
@SpringBootApplication()
public class DesignApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignApplication.class, args);
    }
}

package com.sking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.sking.mapper")
public class SkingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkingApplication.class, args);
    }

}

package com.tamy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@MapperScan("com.tamy.dao")
//@EnableWebSecurity
@SpringBootApplication
public class TamyblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(TamyblogApplication.class, args);
    }

}

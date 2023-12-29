package com.example.fruit_service_oa2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.fruit_service_oa2.mapper")
@SpringBootApplication
public class FruitServiceOa2Application {

    public static void main(String[] args) {
        SpringApplication.run(FruitServiceOa2Application.class, args);
    }

}

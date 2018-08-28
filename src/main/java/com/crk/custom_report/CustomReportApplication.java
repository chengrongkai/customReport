package com.crk.custom_report;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.crk.custom_report.dao")
public class CustomReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomReportApplication.class, args);
    }
}

package com.example.waterbill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.waterbill") // Quét package chứa controller
public class WaterBillManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(WaterBillManagementApplication.class, args);
    }
}

package com.ysl.webmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ysl")
public class WebManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebManagerApplication.class, args);
    }

}

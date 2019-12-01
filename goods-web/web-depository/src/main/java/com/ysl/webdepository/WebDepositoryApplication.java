package com.ysl.webdepository;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ysl")
@MapperScan("com.ysl.dao")
@DubboComponentScan("com.ysl.service")
public class WebDepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebDepositoryApplication.class, args);
    }

}

package com.atguigu.spring.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@ComponentScan(basePackages = "com.atguigu.spring.alibaba.dao")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
@EnableDiscoveryClient
public class StorageService2002 {

    public static void main(String[] args) {
        SpringApplication.run(StorageService2002.class, args);
    }

}

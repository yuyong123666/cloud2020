package com.atguigu.spring.alibaba;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@ComponentScan(basePackages = "com.atguigu.spring.alibaba.dao")
@EnableAutoDataSourceProxy
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)// 取消数据源的自动创建
public class OrderService2001 {

    public static void main(String[] args) {
        SpringApplication.run(OrderService2001.class, args);
    }
}

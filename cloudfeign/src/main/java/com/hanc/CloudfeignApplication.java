package com.hanc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * Feign 采用的是基于接口的注解
 * Feign 整合了ribbon
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard //关于仪表的网页监控
public class CloudfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudfeignApplication.class, args);
    }
}

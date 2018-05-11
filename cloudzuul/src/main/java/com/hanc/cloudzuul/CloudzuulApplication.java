package com.hanc.cloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 路由网关，多加一个地址栏来确定进入到指定的服务
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class CloudzuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudzuulApplication.class, args);
    }
}

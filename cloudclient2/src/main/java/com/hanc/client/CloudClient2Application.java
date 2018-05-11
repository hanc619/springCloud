package com.hanc.client;

import com.hanc.cloudClient2.IRemoteUserService;
import com.hanc.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class CloudClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudClient2Application.class, args);
    }
}

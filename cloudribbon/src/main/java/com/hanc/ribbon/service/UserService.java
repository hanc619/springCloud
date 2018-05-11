package com.hanc.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "clientError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://cloud-client2/hi?name="+name,String.class);
    }

    public String clientError(String name) {
        return "hi,"+name+",sorry,error!";
    }



}

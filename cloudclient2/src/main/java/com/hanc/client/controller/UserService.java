package com.hanc.client.controller;

import com.hanc.cloudClient2.IRemoteUserService;
import com.hanc.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService  implements IRemoteUserService {

    @Value("${server.port}")
    String port;


    @Override
    public String getNameAndPort(String name) {
        return "hi "+name+",i am from port:" +port;
    }

    @Override
    public String getNameAndMobile(@RequestBody Person person) {
        return person.toString();
    }
}

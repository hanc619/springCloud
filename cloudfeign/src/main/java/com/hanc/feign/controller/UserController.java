package com.hanc.feign.controller;

import com.hanc.cloudClient2.IRemoteUserService;
import com.hanc.feign.remoteservice.IMyRemoteUserService;
import com.hanc.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserControllerAPI{

    @Autowired
    IRemoteUserService userService;

    @Override
    public String sayHi(@RequestParam String name) {
        return userService.getNameAndPort(name);
    }

    @Override
    public String person(@RequestParam String name, @RequestParam String mobile) {
        Person person = new Person(name, mobile);
        return userService.getNameAndMobile(person);
    }

}

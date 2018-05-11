package com.hanc.ribbon.controller;

import com.hanc.ribbon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public UserController() {
        System.out.println(123);
    }

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return userService.hiService(name);
    }

    @RequestMapping(value = "/person")
    public String person(@RequestParam String name, @RequestParam String mobile) {
        return "name is " + name + "mobile is " + mobile;
    }

}

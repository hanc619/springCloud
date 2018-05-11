package com.hanc.feign.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public interface UserControllerAPI {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHi(@RequestParam String name);

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    String person(@RequestParam String name, @RequestParam String mobile);
}

package com.hanc.cloudClient2;

import com.hanc.Hystric.UserServiceHystric;
import com.hanc.model.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-client2", fallback = UserServiceHystric.class)
public interface IRemoteUserService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String getNameAndPort(@RequestParam("name") String name);

    @RequestMapping(value = "/person")
    String getNameAndMobile(@RequestBody Person person);
}

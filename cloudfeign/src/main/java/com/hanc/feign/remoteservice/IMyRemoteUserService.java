package com.hanc.feign.remoteservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-client2")
public interface IMyRemoteUserService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String getNameAndPort(@RequestParam("name")String name);
}

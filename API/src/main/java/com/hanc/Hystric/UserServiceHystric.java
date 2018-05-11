package com.hanc.Hystric;

import com.hanc.cloudClient2.IRemoteUserService;
import com.hanc.model.Person;
import org.springframework.stereotype.Component;

@Component
public class UserServiceHystric implements IRemoteUserService {
    @Override
    public String getNameAndPort(String name) {
        return "getNameAndPort service is error " + name;
    }

    @Override
    public String getNameAndMobile(Person person) {
        return "getNameAndMobile service is error " + person.toString();
    }
}

package com.hanc.model;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 4100330511299153857L;
    String name;
    String mobile;

    public Person() {
    }

    public Person(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}

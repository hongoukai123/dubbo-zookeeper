package com.kai.chap.service.impl;

import com.kai.chap.service.IDemoService;

public class DemoServiceImpl implements IDemoService {


    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}

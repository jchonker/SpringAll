package com.eternity.bootpractice.webservice.server;

import java.util.Date;

/**
 * @Author jchonker
 * @Date 2020/5/24 11:00
 * @Version 1.0
 */
public class DemoServiceImpl implements DemoService{

    @Override
    public String sayHello(String user) {
        return user+":hello"+"("+new Date()+")";
    }
}

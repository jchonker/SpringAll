package com.eternity.bootpractice.webservice.server;

import javax.jws.WebService;

/**
 * @Author jchonker
 * @Date 2020/5/24 10:59
 * @Version 1.0
 */
@WebService
public interface DemoService {
    public String sayHello(String user);
}

package lz.test.service.impl;

import lz.test.service.HelloService;

/**
 * Created by liuzheng on 16/4/19.
 */
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "hi, " + name + "\n";
    }
}

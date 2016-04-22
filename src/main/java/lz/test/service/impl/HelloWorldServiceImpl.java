package lz.test.service.impl;

import lz.test.service.HelloWorldService;

/**
 * Created by liuzheng on 16/4/19.
 */
public class HelloWorldServiceImpl implements HelloWorldService {
    public String sayHello(String name) {
        return "hi, " + name + "\n";
    }
}

package lz.test.service;

import lz.test.bean.Person;

/**
 * Created by liuzheng on 16/4/19.
 */
public interface HelloService {
    String sayHello(String name);
    void exceptFunc();
    Person who(String name);
}

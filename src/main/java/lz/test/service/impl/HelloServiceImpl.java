package lz.test.service.impl;

import lz.test.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by liuzheng on 16/4/19.
 */
@Service(value = "helloService")
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "hi, " + name + "\n";
    }
}

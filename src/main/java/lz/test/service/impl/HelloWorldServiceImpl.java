package lz.test.service.impl;

import lz.test.service.IHelloWorldService;
import org.springframework.stereotype.Service;

/**
 * Created by liuzheng on 16/4/19.
 */
@Service
public class HelloWorldServiceImpl implements IHelloWorldService {
    public String sayHello(String name) {
        return "hi, " + name;
    }
}

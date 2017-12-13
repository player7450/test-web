package lz.test.service.impl;

import lz.test.bean.Person;
import lz.test.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by liuzheng on 16/4/19.
 */
@Service(value = "helloService")
public class HelloServiceImpl implements HelloService {

    private final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    public String sayHello(String name) {
        String hiMsg = "hi, " + name;

        return hiMsg;
    }

    public void exceptFunc() {
        int i = 0, j = 1;
        if (1 == 1) {
            j = 4 / i;
        }
    }

    public Person who(String name) {
        Person p = Person.builder()
                .name(name)
                .age(16)
                .build();

        return p;
    }

}

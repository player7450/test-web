package lz.test.controller;

import lz.test.bean.Person;
import lz.test.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by liuzheng on 16/6/18.
 */
@Controller
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Resource
    private HelloService helloService;

    @RequestMapping(value = "/hello.do", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(@RequestParam String name) {
        String hiMsg = helloService.sayHello(name);
        logger.info(hiMsg);
        return hiMsg;
    }

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    @ResponseBody
    public Person getPerson(@RequestParam String name) {
        Person p = new Person();
        p.setName(name);
        p.setAge(16);

        return p;
    }


}

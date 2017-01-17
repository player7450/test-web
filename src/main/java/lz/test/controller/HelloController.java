package lz.test.controller;

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
    private HelloService helloWorldService;

    @RequestMapping(value = "/hello.do", method = RequestMethod.GET)
    public @ResponseBody String sayHello(@RequestParam String name) {
        String hiMsg = helloWorldService.sayHello(name);
        logger.info(hiMsg);
        return hiMsg;
    }
}

package lz.test.controller;

import lz.test.bean.AjaxResult;
import lz.test.bean.Person;
import lz.test.data.PersonMapper;
import lz.test.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by liuzheng on 16/6/18.
 */
@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Resource
    private HelloService helloService;
    @Resource
    private PersonMapper personMapper;

    @RequestMapping(value = "/hello.do", method = RequestMethod.GET)
    public AjaxResult sayHello(@RequestParam String name) {
        String hiMsg = helloService.sayHello(name);

        return AjaxResult.success(hiMsg);
    }

    @RequestMapping(value = "/who.do", method = RequestMethod.GET)
    public AjaxResult getPerson(@RequestParam String name) {
        Person p = helloService.who(name);

        return AjaxResult.success(p);
    }

    @RequestMapping(value = "/exception.do", method = RequestMethod.GET)
    public AjaxResult exceptFunc() {
        helloService.exceptFunc();

        return AjaxResult.success();
    }

    @RequestMapping(value = "/mybatistest.do", method = RequestMethod.GET)
    public AjaxResult mybatisTest() {
        Integer count = personMapper.countPerson();

        return AjaxResult.success("mybatis test. count is " + count);
    }
}

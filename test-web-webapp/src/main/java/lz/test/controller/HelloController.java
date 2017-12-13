package lz.test.controller;

import lz.test.bean.AjaxResult;
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
    public AjaxResult sayHello(@RequestParam String name) {
        String hiMsg = helloService.sayHello(name);

        return AjaxResult.success(hiMsg);
    }

    @RequestMapping(value = "/who.do", method = RequestMethod.GET)
    @ResponseBody
    public AjaxResult getPerson(@RequestParam String name) {
        Person p = helloService.who(name);

        return AjaxResult.success(p);
    }

    @RequestMapping(value = "/exception.do", method = RequestMethod.GET)
    @ResponseBody
    public AjaxResult exceptFunc() {
        helloService.exceptFunc();

        return AjaxResult.success();
    }
}

package com.zdp.springcloud.consumer.feign;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author <a href="mailto:zhoudapeng8888@126.com">zhoudapeng</a>
 * Date 2018/6/6
 * Time 上午11:34
 */
@RestController
public class HelloController {
    @Resource
    private SayHelloService sayHelloService;
    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return sayHelloService.sayHello(name);
    }
}

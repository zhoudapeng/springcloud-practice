package com.zdp.springcloud.consumer.ribbon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author <a href="mailto:zhoudapeng8888@126.com">zhoudapeng</a>
 * Date 2018/6/6
 * Time 上午10:10
 */
@RestController
public class HelloController {
    @Resource
    private HelloService helloService;
    @RequestMapping("/hello")
    public String sayHello(@RequestParam("name") String name) {
        return helloService.sayHello(name);
    }
}

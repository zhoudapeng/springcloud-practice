package com.zdp.springcloud.consumer.feign;

import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:zhoudapeng8888@126.com">zhoudapeng</a>
 * Date 2018/6/6
 * Time 下午1:51
 */
@Service
public class SayHelloServiceFailback implements SayHelloService {
    @Override
    public String sayHello(String name) {
        return "sorry " + name + ",something is error";
    }
}

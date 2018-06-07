package com.zdp.springcloud.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = SayHelloServiceFailback.class)
public interface SayHelloService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);
}

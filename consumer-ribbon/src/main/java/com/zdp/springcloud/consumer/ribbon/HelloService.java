package com.zdp.springcloud.consumer.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author <a href="mailto:zhoudapeng8888@126.com">zhoudapeng</a>
 * Date 2018/6/6
 * Time 上午10:08
 */
@Service
public class HelloService {
    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "onError")
    public String sayHello(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String onError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}

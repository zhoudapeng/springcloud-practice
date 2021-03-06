package com.zdp.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author <a href="mailto:zhoudapeng8888@126.com">zhoudapeng</a>
 * Date 2018/6/7
 * Time 下午5:07
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigServiceClusterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceClusterApplication.class,args);
    }
}

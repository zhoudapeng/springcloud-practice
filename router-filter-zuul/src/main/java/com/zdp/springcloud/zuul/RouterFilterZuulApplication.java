package com.zdp.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class RouterFilterZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(RouterFilterZuulApplication.class, args);
	}
}

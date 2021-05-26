package com.osg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com/osg.springboot")
public class GreetingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingServiceApplication.class, args);
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.bean.HelloWorld;

@SpringBootApplication
public class SpringAopDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c=SpringApplication.run(SpringAopDemoApplication.class, args);
		
		HelloWorld h=c.getBean(HelloWorld.class);
		h.login();
	}

}

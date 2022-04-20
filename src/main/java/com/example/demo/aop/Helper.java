package com.example.demo.aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.*;
@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	@Before("execution(public void login())")
	public void checkUser() {
		System.out.println("User Verified");
	}
	@After("execution(public void login())")
	public void logOut() {
		System.out.println("Logged out");
	}
}

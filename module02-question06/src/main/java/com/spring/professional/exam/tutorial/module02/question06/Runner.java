package com.spring.professional.exam.tutorial.module02.question06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module02.question06.beans.HelloBean;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		context.registerShutdownHook();
		
		HelloBean helloBean = context.getBean(HelloBean.class);
		helloBean.sayHello();
	}

}

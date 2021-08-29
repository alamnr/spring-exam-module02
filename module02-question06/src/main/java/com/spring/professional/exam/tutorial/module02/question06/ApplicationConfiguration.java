package com.spring.professional.exam.tutorial.module02.question06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.spring.professional.exam.tutorial.module02.question06.aspect.HelloBeanAspect;
import com.spring.professional.exam.tutorial.module02.question06.beans.HelloBean;

//@ComponentScan
@EnableAspectJAutoProxy
public class ApplicationConfiguration {

	@Bean
	public HelloBeanAspect helloBeanAspect() {
		return new HelloBeanAspect();
	}
	
	@Bean
	public HelloBean helloBean() {
		return new HelloBean();
	}
}

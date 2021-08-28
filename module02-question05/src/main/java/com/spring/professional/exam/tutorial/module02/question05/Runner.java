package com.spring.professional.exam.tutorial.module02.question05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module02.question05.repository.EmployeeRepository;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		context.registerShutdownHook();
		
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
		employeeRepository.findEmployeeById(5);
		
		try {
			employeeRepository.findEmployeeById(-1);
		} catch (Exception ignored) {
			// ignored
		}
	}

}

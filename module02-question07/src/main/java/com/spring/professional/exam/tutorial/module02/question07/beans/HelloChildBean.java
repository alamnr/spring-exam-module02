package com.spring.professional.exam.tutorial.module02.question07.beans;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module02.question07.ds.Person;

@Component
public class HelloChildBean extends HelloBean {

	@Override
	public void sayHello(String name, int ex) {
		System.out.println("Hello from SpringChildBean for -"+ name);
	}

	public void validateName(String name) throws Exception {
		
	}
	
	public void saveCounterValue(int counterValue) {
		
	}
	
	public void savePerson(Person person) {
		
	}
	
}

package com.spring.professional.exam.tutorial.module02.question03.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeRepositoryAspect {

	@Before("execution(* com.spring.professional.exam.tutorial.module02.question03.service.a.EmployeeRepositoryImpl.findEmployeeById(..))")
	public void beforeFindEmployeeById() {
		System.out.println("Service A- Before find employee by id");
	}
	
	//@After("within(com.spring.professional.exam.tutorial.module02.question03.service.a.*)")
	public void afterExecutionWwithinPackage() {
		System.out.println("Service A - After execution  wwithin package");
	}
}

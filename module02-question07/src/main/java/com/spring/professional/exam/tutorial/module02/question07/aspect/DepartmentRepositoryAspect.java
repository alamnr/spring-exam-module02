package com.spring.professional.exam.tutorial.module02.question07.aspect;

import org.aspectj.lang.annotation.Before;

public class DepartmentRepositoryAspect {
	
	@Before("@within(com.spring.professional.exam.tutorial.module02.question07.annotations.MonitoredRepository)")
	public void annotationWithinExample() {
		System.out.println(" Before - annotationWithinExample ");
	}
	
	
	@Before("@target(com.spring.professional.exam.tutorial.module02.question07.annotations.MonitoredRepository)")
	public void annotationTargetExample() {
		System.out.println("Before - annotationTargetExample ");
	}

}

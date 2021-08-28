package com.spring.professional.exam.tutorial.module02.question05.repository;


import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module02.question05.ds.Employee;

@Component
public class EmployeeRepository {
	
	public Employee findEmployeeById(long id) {
		if(id == -1) {
			throw new IllegalArgumentException(" Id can not be -1 ");
		}
		
		return new Employee(id);
	}
	
	public void saveEmployee(Employee employee) {
		
	}
	
	public void deleteEmployee(Employee employee) {
		
	}
}

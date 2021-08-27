package com.spring.professional.exam.tutorial.module02.question03.service.b;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module02.question03.ds.Employee;

@Component("alternateEmployeeRepository")
public class AlternateEmployeeRepository  {

	public Employee findByEmployeeId(long id) {
		return new Employee();
	}
	
	public void saveEmployee(Employee employee) {
		
	}
	
	public void deleteEmployee() {
		
	}
}

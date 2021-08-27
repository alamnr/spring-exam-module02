package com.spring.professional.exam.tutorial.module02.question03.service.a;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module02.question03.ds.Employee;

@Component
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public Employee findEmployeeById(long id) {
		this.saveEmployee(null);
		return new Employee();
	}

	@Override
	public void saveEmployee(Employee employee) {
		
		
	}

	@Override
	public void deleteEmployee(Employee employee) {
		
		
	}

}

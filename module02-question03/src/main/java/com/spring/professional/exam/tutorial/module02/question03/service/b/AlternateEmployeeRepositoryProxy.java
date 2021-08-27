package com.spring.professional.exam.tutorial.module02.question03.service.b;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module02.question03.ds.Employee;

@Component
public class AlternateEmployeeRepositoryProxy extends AlternateEmployeeRepository {

	@Override
	public Employee findByEmployeeId(long id) {
		System.out.println("Before -  findEmployeeById ");
		Employee employee = super.findByEmployeeId(id);
		System.out.println("After -  findEmployeeById ");
		return  employee;
	}

	@Override
	public void saveEmployee(Employee employee) {
		System.out.println("Before -  saveEmployee ");
		super.saveEmployee(employee);
		System.out.println("After -  saveEmployee ");
		
	}

	@Override
	public void deleteEmployee() {
		System.out.println("Before -  deleteEmployee ");
		super.deleteEmployee();
		System.out.println("After -  deleteEmployee ");
	}
	
	

}

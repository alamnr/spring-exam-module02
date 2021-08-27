package com.spring.professional.exam.tutorial.module02.question04.service.a;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module02.question04.ds.Employee;

@Component
public /*final*/ class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public Employee findEmployeeById(long id) {
		
		return new Employee();
	}

	@Override
	public void saveEmployee(Employee employee) {
		
	}

	@Override
	public /*final*/ void deleteEmployee(long id) {
		
	}

	@Override
	public void findAndUpdateEmployeeById(long id, Employee employeeToMerge) {
		Employee employee =  findEmployeeById(id);
		saveEmployee(employee);
		
	}
	
	public void deleteByEmail(String email) {
		
	}

}

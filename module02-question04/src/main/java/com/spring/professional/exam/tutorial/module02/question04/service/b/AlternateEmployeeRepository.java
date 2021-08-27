package com.spring.professional.exam.tutorial.module02.question04.service.b;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module02.question04.ds.Employee;

@Component
public /* final */ class AlternateEmployeeRepository {

	public Employee findEmployeeById(long id) {

		return new Employee();
	}

	public void saveEmployee(Employee employee) {

	}

	public /* final */  void deleteEmployee(Employee employee) {

	}

	public void findAndUpdateEmployeeById(long id, Employee employeeToMerge) {
		Employee employee = findEmployeeById(id);
		saveEmployee(employee);

	}

}

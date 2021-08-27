package com.spring.professional.exam.tutorial.module02.question03.service.a;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module02.question03.ds.Employee;

@Component
public class EmployeeRepositoryProxy  implements EmployeeRepository {
	
	private final EmployeeRepositoryImpl employeeRepositoryImpl;
	
	public  EmployeeRepositoryProxy(EmployeeRepositoryImpl employeeRepositoryImpl) {
		this.employeeRepositoryImpl = employeeRepositoryImpl;
	}

	@Override
	public Employee findEmployeeById(long id) {
		System.out.println("Before -  findEmployeeById ");
		Employee employee = employeeRepositoryImpl.findEmployeeById(0);
		System.out.println("After -  findEmployeeById ");
		return employee;
	}

	@Override
	public void saveEmployee(Employee employee) {
		System.out.println("Before -  saveEmployee ");
		employeeRepositoryImpl.saveEmployee(employee);		
		System.out.println("After -  saveEmployee ");
		
	}

	@Override
	public void deleteEmployee(Employee employee) {
		System.out.println("Before -  deleteEmployee ");
		employeeRepositoryImpl.deleteEmployee(employee);		
		System.out.println("After -  deleteEmployee ");
		
	}

}

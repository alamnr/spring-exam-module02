package com.spring.professional.exam.tutorial.module02.question03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module02.question03.ds.Employee;
import com.spring.professional.exam.tutorial.module02.question03.service.a.EmployeeRepository;
import com.spring.professional.exam.tutorial.module02.question03.service.a.EmployeeRepositoryImpl;
import com.spring.professional.exam.tutorial.module02.question03.service.a.EmployeeRepositoryProxy;
import com.spring.professional.exam.tutorial.module02.question03.service.b.AlternateEmployeeRepository;
import com.spring.professional.exam.tutorial.module02.question03.service.b.AlternateEmployeeRepositoryProxy;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		context.registerShutdownHook();
		
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepositoryImpl.class);
		AlternateEmployeeRepository alternateEmployeeRepository = (AlternateEmployeeRepository) context.getBean("alternateEmployeeRepository");
		
		
		Employee employee = employeeRepository.findEmployeeById(0);
		employeeRepository.saveEmployee(employee);
		employeeRepository.deleteEmployee(employee);
		
		
		employee = alternateEmployeeRepository.findByEmployeeId(0);
		alternateEmployeeRepository.saveEmployee(employee);
		alternateEmployeeRepository.deleteEmployee();
		
		employeeRepository = context.getBean(EmployeeRepositoryProxy.class);
		employee = employeeRepository.findEmployeeById(0);
		employeeRepository.saveEmployee(employee);
		employeeRepository.deleteEmployee(employee);
		
		alternateEmployeeRepository =  context.getBean(AlternateEmployeeRepositoryProxy.class);
		employee = alternateEmployeeRepository.findByEmployeeId(0);
		alternateEmployeeRepository.saveEmployee(employee);
		alternateEmployeeRepository.deleteEmployee();
		
	}

}

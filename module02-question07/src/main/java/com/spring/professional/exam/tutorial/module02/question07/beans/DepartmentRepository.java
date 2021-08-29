package com.spring.professional.exam.tutorial.module02.question07.beans;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module02.question07.ds.Department;

@Component
public class DepartmentRepository {
	
	public Department findDepartment(String department) {
		return new Department();
	}
	
	public void updateDepartment(int id , Department department) {
		
	}

}

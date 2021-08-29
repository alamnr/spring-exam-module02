package com.spring.professional.exam.tutorial.module02.question07.beans;

import org.springframework.stereotype.Component;

@Component("taxBean2")
public class TaxBean2 implements ITaxBean {

	@Override
	public float calculateTax(float value) {
		return 5f;
	}

}

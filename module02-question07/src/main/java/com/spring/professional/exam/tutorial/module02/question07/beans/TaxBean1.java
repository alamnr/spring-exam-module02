package com.spring.professional.exam.tutorial.module02.question07.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TaxBean1  implements ITaxBean {

	@Override
	public float calculateTax(float value) {
		
		return 5f;
	}

}

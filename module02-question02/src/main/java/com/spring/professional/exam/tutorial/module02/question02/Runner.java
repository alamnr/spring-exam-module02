package com.spring.professional.exam.tutorial.module02.question02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module02.question02.bls.AlternativeCurrenciesRepository;
import com.spring.professional.exam.tutorial.module02.question02.bls.CurrenciesRepository;
import com.spring.professional.exam.tutorial.module02.question02.bls.CurrencyService;
import com.spring.professional.exam.tutorial.module02.question02.ds.CurrencyId;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		context.registerShutdownHook();
		
		CurrencyService currencyService = context.getBean(CurrencyService.class);
		CurrenciesRepository currenciesRepository = context.getBean(CurrenciesRepository.class);
		AlternativeCurrenciesRepository alternativeCurrenciesRepository = context.getBean(AlternativeCurrenciesRepository.class);
		
		currencyService.getExchangeRate("EUR", "USD");
		currencyService.getExchangeRate("EUR", "USD", 100);
		currencyService.getCurrencyLongName(CurrencyId.EUR);
		
		try {
			currencyService.getCurrencyCountryName(CurrencyId.EUR);
		} catch (Exception e) {
			
		}
		
		currencyService.getCurrencyCountryName(CurrencyId.USD);
		currenciesRepository.getCurrenciesCount();
		alternativeCurrenciesRepository.getCurrenciesCount();
	}

}

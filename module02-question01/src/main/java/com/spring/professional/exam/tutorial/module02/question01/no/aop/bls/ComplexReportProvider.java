package com.spring.professional.exam.tutorial.module02.question01.no.aop.bls;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module02.question01.no.aop.ds.Report;

@Component
public class ComplexReportProvider {
	
	public Report getReport() throws InterruptedException {
		System.out.println("Fetching the report ...");
		Thread.sleep(TimeUnit.SECONDS.toMillis(3));
		System.out.println("Report created");
		
		return new Report();
		
	}

}

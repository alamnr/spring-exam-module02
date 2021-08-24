package com.spring.professional.exam.tutorial.module02.question01.with.aop.bls;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module02.question01.with.aop.annotations.Cacheable;
import com.spring.professional.exam.tutorial.module02.question01.with.aop.annotations.PerformanceLogger;
import com.spring.professional.exam.tutorial.module02.question01.with.aop.ds.Report;

@Component
public class ComplexReportProvider {
	@PerformanceLogger
	@Cacheable
	public Report getReport() throws InterruptedException {
		System.out.println("Fetching the report ...");
		Thread.sleep(TimeUnit.SECONDS.toMillis(3));
		System.out.println("Report created");
		
		return new Report();
		
	}

}

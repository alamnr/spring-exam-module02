package com.spring.professional.exam.tutorial.module02.question01.with.aop.bls;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module02.question01.with.aop.annotations.PerformanceLogger;
import com.spring.professional.exam.tutorial.module02.question01.with.aop.ds.Report;

@Component
public class ComplexReportRepository {
	@PerformanceLogger
	public void save(Report report) throws InterruptedException {
		System.out.println("Saving the report ...");
		Thread.sleep(TimeUnit.SECONDS.toMillis(2));
		System.out.println("Report saved");
		
	}

}

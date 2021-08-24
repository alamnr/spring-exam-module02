package com.spring.professional.exam.tutorial.module02.question01.no.aop.bls;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module02.question01.no.aop.ds.FormattedReport;
import com.spring.professional.exam.tutorial.module02.question01.no.aop.ds.Report;

@Component
public class ComplexReportFormatter {
	
	public FormattedReport formatReport(Report report) throws InterruptedException {
		System.out.println("Formating the report ...");
		Thread.sleep(TimeUnit.SECONDS.toMillis(1));
		System.out.println("Report Formatted");
		
		return new FormattedReport(report);
	}

}

package com.spring.professional.exam.tutorial.module02.question01.with.aop.aspects;

import java.time.Duration;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceLooggerAspect {
	
	private Logger logger = Logger.getLogger("performance.logger");
	
	@Around("@annotation(com.spring.professional.exam.tutorial.module02.question01.with.aop.annotations.PerformanceLogger)")
	public Object logPerformance(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		try {
				return proceedingJoinPoint.proceed();
		} finally {
			long finishTime = System.currentTimeMillis();
			Duration time = Duration.ofMillis(finishTime-startTime);
			
			logger.info(String.format("Duration of %s execution was %s ", proceedingJoinPoint.getSignature(),time));
		} 
	}

}

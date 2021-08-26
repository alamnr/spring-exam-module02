package com.spring.professional.exam.tutorial.module02.question02.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CurrencyServiceAspect {
	
	@Pointcut("@annotation(com.spring.professional.exam.tutorial.module02.question02.annotations.InTransaction)")
	public void transactionAnnotationPointcut() {
		
	}
	
	@Pointcut("within(com.spring.professional.exam.tutorial.module02.question02.bls.*)")
	public void blsPackagePointcut() {
		
	}
	
	@Pointcut("@within(com.spring.professional.exam.tutorial.module02.question02.annotations.Secured)")
	public void securedClassPointcut() {
		
	}
	
	@Pointcut("execution(* com.spring.professional.exam.tutorial.module02.question02.bls.CurrencyService.getExchangeRate(..))")
	public void getExchangeRateMethodPointcut() {
		
	}

	@Pointcut("bean(currency_service)")
	public void namedBeanPointcut() {
		
	}
	
	@Pointcut("args(String,String,int)")
	public void stringAndIntegerArgumentMethodPointcut() {
		
	}
	
	@Pointcut("@args(com.spring.professional.exam.tutorial.module02.question02.annotations.Validated)")
	public void validatedArgumentPointCut() {
		
	}
	
	@Pointcut("target(com.spring.professional.exam.tutorial.module02.question02.bls.CurrencyService)")
	public void currencyServiceTargetPointcut() {
		
	}
	
	@Pointcut("@target(com.spring.professional.exam.tutorial.module02.question02.annotations.Secured)")
	public void currencyServiceSecuredTargetPointcut() {
		
	}
	
	@Pointcut("this(com.spring.professional.exam.tutorial.module02.question02.bls.CurrencyService)")
	public void currencyServiceThisPointcut() {
		
	}
	
	@Pointcut("blsPackagePointcut() && transactionAnnotationPointcut()")
	public void blsPackageAndInTransactionPointCut() {
		
	}
	
	@Before("transactionAnnotationPointcut()")
	public void transactionAnnotationAdvice() {
		System.out.println("Before - transactionAnnotationPointcut");
	}
	
	@Before("blsPackagePointcut()")
	public void beforeBlsPackageAdvice() {
		System.out.println("Before - blsPackagePointcut");
	}
	
	@Before("securedClassPointcut()")
	public void beforeSecuredClassAdvice() {
		System.out.println("Before - securedClassPointcut");
	}
	
	@Around("getExchangeRateMethodPointcut()")
	public Object aroundSecuredClassAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{ 
		try {
			System.out.println("Before - getExchangeRateMethodPointcut");
			return proceedingJoinPoint.proceed();
		} finally {
			System.out.println("After - getExchangeRateMethodPointcut");
		}		
	}
	
	@After("namedBeanPointcut()")
	public void afterNamedBeanAdvice() {
		System.out.println("After - namedBeanPointcut");
	}
	
	@After("stringAndIntegerArgumentMethodPointcut()")
	public void afterStringAndIntegerArgumentMethodAdvice() {
		System.out.println("After - stringAndIntegerArgumentMethodPointcut");
	}
	
	@After("validatedArgumentPointCut()")
	public void afterValidatedArgumentAdvice() {
		System.out.println("After - validatedArgumentPointCut");
	}
	
	@After("currencyServiceTargetPointcut()")
	public void afterCurrencyServiceTargetAdvice() {
		System.out.println("After - currencyServiceTargetPointcut ");
	}
	
	@After("currencyServiceSecuredTargetPointcut()")
	public void afterCurrencyServiceSecuredTargetAdvice() {
		System.out.println("After - currencyServiceSecuredTargetPointcut");
	}
	
	@After("currencyServiceThisPointcut()")
	public void afterCurrencyServiceThisAdvice() {
		System.out.println("After - currencyServiceThisPointcut");
	}
	
	@After("blsPackageAndInTransactionPointCut()")
	public void afterBlsPackageAndInTransactionAdvice() {
		System.out.println("After - blsPackageAndInTransactionPointCut");
	}
	
	@AfterThrowing(value = "execution(* com.spring.professional.exam.tutorial.module02.question02.bls.CurrencyService.getCurrencyCountryName(..))",
			throwing = "exception")
	public void afterThrowingException(Exception exception) {
		System.out.println("Exception was thrown from getCurrencyCountryName: "+ exception.getClass().getSimpleName());
		
	}
	
	@AfterReturning(value = "execution(* com.spring.professional.exam.tutorial.module02.question02.bls.CurrencyService.getCurrencyCountryName(..))",
			returning = "value")
	public void afterReturningValue(String value) {
		System.out.println("Value returned from getCurrencyCountryName: " +value);
	}
	
	
}

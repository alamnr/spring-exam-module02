package com.spring.professional.exam.tutorial.module02.question03;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
//@EnableAspectJAutoProxy
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ApplicationConfiguration {

}

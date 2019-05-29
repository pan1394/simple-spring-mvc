package com.linkstec.mvc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

//@Aspect
@Component
public class PerformanceInterceptor {

	
	@Pointcut("within(com.linkstec.mvc.controller..*)")
	public void pointCutx() {};
	
	@Around("pointCutx()")
	public Object performanceTest(ProceedingJoinPoint pj) throws Throwable{
		StopWatch watch = new StopWatch();
		watch.start();
		Object obj = pj.proceed();
		watch.stop();
		System.out.println(String.format("方法%s()消耗时间%d毫秒", pj.getSignature().getName(), watch.getTotalTimeMillis()));
		return obj;
	}
}

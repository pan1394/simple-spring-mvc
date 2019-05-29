package com.linkstec.mvc.config;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class CustomInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		StopWatch watch = new StopWatch();
		watch.start();
		Object obj = invocation.proceed();
		watch.stop();
		System.out.println(String.format("方法%s()消耗时间%d毫秒", invocation.getMethod().getName(), watch.getTotalTimeMillis()));
		return obj;
	}

	
}

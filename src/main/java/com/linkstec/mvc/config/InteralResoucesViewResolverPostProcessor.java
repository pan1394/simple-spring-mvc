package com.linkstec.mvc.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 使用后置处理器处理默认InternalResourceViewResolver,设置前缀后缀。
 * @author panyl
 *
 */
//@Component
public class InteralResoucesViewResolverPostProcessor implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println(beanName);
		if(beanName.equals("org.springframework.web.servlet.view.InternalResourceViewResolver")) {
			InternalResourceViewResolver viewResolver = (InternalResourceViewResolver)bean;
			viewResolver.setPrefix("/WEB-INF/jsp/");
			viewResolver.setSuffix(".jsp");
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

}
package com.linkstec.mvc.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.filter.GenericFilterBean;

public class SimpleFilter extends GenericFilterBean {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest rq = (HttpServletRequest)request;
		//System.out.println(request.getCharacterEncoding());
		//System.out.println(rq.getRequestURL());
		chain.doFilter(request, response);
	}

}

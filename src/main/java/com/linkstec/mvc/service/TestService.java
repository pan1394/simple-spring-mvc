package com.linkstec.mvc.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	public String say(String something) {
		System.out.println("I said:" + something);
		return something;
	}
}

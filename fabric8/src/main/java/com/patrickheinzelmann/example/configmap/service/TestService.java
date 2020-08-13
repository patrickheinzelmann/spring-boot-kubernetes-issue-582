package com.patrickheinzelmann.example.configmap.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Value("${example.value1}")
	private String value1;
	
	@Value("${example.value2}")
	private String value2;
	
	public TestService() {
		super();
	}

	public String getValue1() {
		return this.value1;
	}
	
	public String getValue2() {
		return this.value2;
	}
	
}

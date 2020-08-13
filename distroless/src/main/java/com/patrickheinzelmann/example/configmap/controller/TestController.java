package com.patrickheinzelmann.example.configmap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.patrickheinzelmann.example.configmap.service.TestService;

@CrossOrigin
@RestController
@RequestMapping("test")
@EnableAutoConfiguration
public class TestController {

	@Autowired
	private TestService service;
	
    @GetMapping("/value1")
    @ResponseStatus(value = HttpStatus.OK)
	public String getValue1() {
    	return service.getValue1();
    }
    
    @GetMapping("/value2")
    @ResponseStatus(value = HttpStatus.OK)
	public String getValue2() {
    	return service.getValue2();
    }
    
}

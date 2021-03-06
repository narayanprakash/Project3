package com.in28minutes.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.Limit;
import com.in28minutes.microservices.limitsservice.configuration.Configuration;

@Component
public class LimitController {

	//This is Dependency injection
	@Autowired
	
	private Configuration configuration;

	@GetMapping("/limits")
	public Limit retrieveLimits() {
		return new Limit(configuration.getMinimum(), configuration.getMaximum());
	}

}

package com.in28minutes.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.Limit;
import com.in28minutes.microservices.limitsservice.configuration.Configuration;

@RestController
public class LimitController {
	@Autowired
	private Configuration configuration;
	
	@PostMapping("/api/limits")
	public Limit retrieveLimits() {
		return new Limit(configuration.getMinimum(), configuration.getMaximum());
	}

}

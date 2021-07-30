package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {

	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	@GetMapping("/")
	public String Basedata() {
		log.info("Application running successfully");
		return "service is up and running";
	}
}

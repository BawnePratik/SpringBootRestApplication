package com.nss.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	private static final Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	@GetMapping(value = "/welcome")
	public ResponseEntity<String> getMsg() {
		logger.info("getMsg () method called");
		
		String welcomeMsg = "Welcome to NICE SOFTWARE SOLUTIONS...!!";
		
		logger.info("getMsg () method executed");
		
		return new ResponseEntity<String>(welcomeMsg, HttpStatus.CREATED);
		
	}
}

package com.greetapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetApiController {
	
	private static final Logger LOG = LoggerFactory.getLogger(GreetApiController.class);

	@GetMapping("/greetapi/v1/hello")
	public String greetApi(@RequestParam String user) {
		LOG.info("CalculatorController : greetApi Start");
		if(!StringUtils.isEmpty(user)) {
			return "Hello "+user+"...!!!";
		}else {
			return "Hello World...!!!";
		}
	}
}

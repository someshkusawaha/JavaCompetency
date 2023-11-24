package com.javacompentency.Calculator.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javacompentency.Calculator.service.CalculatorService;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Calculator API")
@RestController
public class CalculatorController implements CalculatorApi{
	
	@Autowired
	CalculatorService calculatorService;
	
	private static final Logger LOG = LoggerFactory.getLogger(CalculatorController.class);

	@GetMapping("/v1/addition")
	@Cacheable(value="RequestResponseCache", cacheManager = "RequestResponseCacheManager")
	public String addition(@RequestParam Integer number1,@RequestParam Integer number2 ){
		LOG.info("CalculatorController : addition Start");
		return calculatorService.addition(number1, number2);
	}
	
	@GetMapping("/v1/subtraction")
	@Cacheable(value="RequestResponseCache", cacheManager = "RequestResponseCacheManager")
	public String subtraction(@RequestParam Integer number1,@RequestParam Integer number2 ){
		LOG.info("CalculatorController : subtraction Start");
		return calculatorService.subtraction(number1, number2);
	}
	
	@GetMapping("/v1/multiplication")
	@Cacheable(value="RequestResponseCache", cacheManager = "RequestResponseCacheManager")
	public String multiplication(@RequestParam Integer number1,@RequestParam Integer number2 ){
		LOG.info("CalculatorController : multiplication Start");
		return calculatorService.multiplication(number1, number2);
	}
	
	@GetMapping("/v1/division")
	@Cacheable(value="RequestResponseCache", cacheManager = "RequestResponseCacheManager")
	public String division(@RequestParam Integer number1,@RequestParam Integer number2 ){
		LOG.info("CalculatorController : division Start");
		return calculatorService.division(number1, number2);
	}
	
	@GetMapping("/v1/square/{number}")
	@Cacheable(value="RequestResponseCache", cacheManager = "RequestResponseCacheManager")
	public String square(@PathVariable Integer number){
		LOG.info("CalculatorController : square Start");
		return calculatorService.square(number);
	}
	
	@GetMapping("/v1/squareroot/{number}")
	@Cacheable(value="RequestResponseCache", cacheManager = "RequestResponseCacheManager")
	public String squareroot(@PathVariable Integer number){
		LOG.info("CalculatorController : squareroot Start");
		return calculatorService.squareroot(number);
	}
	
	@GetMapping("/v1/factorial/{number}")
	@Cacheable(value="RequestResponseCache", cacheManager = "RequestResponseCacheManager")
	public String factorial(@PathVariable Integer number){
		LOG.info("CalculatorController : factorial Start");
		return calculatorService.factorial(number);
	}
	
	@GetMapping("/v1/minmax")
	@Cacheable(value="RequestResponseCache", cacheManager = "RequestResponseCacheManager")
	public String minmax(@RequestBody MinMax minmax){
		LOG.info("CalculatorController : minmax Start");
		return calculatorService.minmax(minmax);
	}
	
}

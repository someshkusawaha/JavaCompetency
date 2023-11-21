package com.javacompentency.Calculator.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

public interface CalculatorApi {

	@Operation(summary = "addition", description = "")
	@ApiResponse(responseCode = "200", description = "Ok", content = @Content)
	@ApiResponse(responseCode = "404", description = "Not Found", content = @Content)
	@ApiResponse(responseCode = "406", description = "Not Acceptable", content = @Content)
	@ApiResponse(responseCode = "400", description = "Incorrect Request", content = @Content)
	@ApiResponse(responseCode = "500", description = "Service Failure", content = @Content)
	public Map<String,String> addition(@RequestParam @Parameter(description = "number1", example = "10" )Integer number1,
			@RequestParam @Parameter(description = "number2", example = "10" )Integer number2 );
	
	@Operation(summary = "subtraction", description = "")
	@ApiResponse(responseCode = "200", description = "Ok", content = @Content)
	@ApiResponse(responseCode = "404", description = "Not Found", content = @Content)
	@ApiResponse(responseCode = "406", description = "Not Acceptable", content = @Content)
	@ApiResponse(responseCode = "400", description = "Incorrect Request", content = @Content)
	@ApiResponse(responseCode = "500", description = "Service Failure", content = @Content)
	public Map<String,String> subtraction(@RequestParam @Parameter(description = "number1", example = "10" )Integer number1,
			@RequestParam @Parameter(description = "number2", example = "10" )Integer number2 );
	
	@Operation(summary = "multiplication", description = "")
	@ApiResponse(responseCode = "200", description = "Ok", content = @Content)
	@ApiResponse(responseCode = "404", description = "Not Found", content = @Content)
	@ApiResponse(responseCode = "406", description = "Not Acceptable", content = @Content)
	@ApiResponse(responseCode = "400", description = "Incorrect Request", content = @Content)
	@ApiResponse(responseCode = "500", description = "Service Failure", content = @Content)
	public Map<String,String> multiplication(@RequestParam @Parameter(description = "number1", example = "10" )Integer number1,
			@RequestParam @Parameter(description = "number2", example = "10" )Integer number2);
	
	@Operation(summary = "division", description = "")
	@ApiResponse(responseCode = "200", description = "Ok", content = @Content)
	@ApiResponse(responseCode = "404", description = "Not Found", content = @Content)
	@ApiResponse(responseCode = "406", description = "Not Acceptable", content = @Content)
	@ApiResponse(responseCode = "400", description = "Incorrect Request", content = @Content)
	@ApiResponse(responseCode = "500", description = "Service Failure", content = @Content)
	public Map<String,String> division(@RequestParam @Parameter(description = "number1", example = "10" )Integer number1,
			@RequestParam @Parameter(description = "number2", example = "10" )Integer number2 );
	
	@Operation(summary = "square", description = "")
	@ApiResponse(responseCode = "200", description = "Ok", content = @Content)
	@ApiResponse(responseCode = "404", description = "Not Found", content = @Content)
	@ApiResponse(responseCode = "406", description = "Not Acceptable", content = @Content)
	@ApiResponse(responseCode = "400", description = "Incorrect Request", content = @Content)
	@ApiResponse(responseCode = "500", description = "Service Failure", content = @Content)
	public Map<String,String> square(@PathVariable @Parameter(description = "number1", example = "10" )Integer number);
	
	@Operation(summary = "squareroot", description = "")
	@ApiResponse(responseCode = "200", description = "Ok", content = @Content)
	@ApiResponse(responseCode = "404", description = "Not Found", content = @Content)
	@ApiResponse(responseCode = "406", description = "Not Acceptable", content = @Content)
	@ApiResponse(responseCode = "400", description = "Incorrect Request", content = @Content)
	@ApiResponse(responseCode = "500", description = "Service Failure", content = @Content)
	public Map<String,String> squareroot(@PathVariable @Parameter(description = "number1", example = "10" )Integer number);
	
	@Operation(summary = "factorial", description = "")
	@ApiResponse(responseCode = "200", description = "Ok", content = @Content)
	@ApiResponse(responseCode = "404", description = "Not Found", content = @Content)
	@ApiResponse(responseCode = "406", description = "Not Acceptable", content = @Content)
	@ApiResponse(responseCode = "400", description = "Incorrect Request", content = @Content)
	@ApiResponse(responseCode = "500", description = "Service Failure", content = @Content)
	public Map<String,String> factorial(@PathVariable @Parameter(description = "number1", example = "10" )Integer number);
	
	@Operation(summary = "minmax", description = "")
	@ApiResponse(responseCode = "200", description = "Ok", content = @Content)
	@ApiResponse(responseCode = "404", description = "Not Found", content = @Content)
	@ApiResponse(responseCode = "406", description = "Not Acceptable", content = @Content)
	@ApiResponse(responseCode = "400", description = "Incorrect Request", content = @Content)
	@ApiResponse(responseCode = "500", description = "Service Failure", content = @Content)
	public Map<String,String> minmax(@RequestBody MinMax minmax);
}

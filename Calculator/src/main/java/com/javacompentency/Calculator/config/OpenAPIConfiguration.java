package com.javacompentency.Calculator.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenAPIConfiguration {

	@Autowired
	private BuildProperties properties;

	@Bean
    OpenAPI openAPI() {
		return new OpenAPI()
				.info(new Info()
				.title("Calculator API Service")
				.version(properties.getVersion())
				.description("Calculator API Service : Provided Different types mathematics operations services."));
	}
}

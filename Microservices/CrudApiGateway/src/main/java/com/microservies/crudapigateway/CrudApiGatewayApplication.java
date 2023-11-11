package com.microservies.crudapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CrudApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApiGatewayApplication.class, args);
	}

}

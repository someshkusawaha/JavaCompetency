package com.microservies.crudapiaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CrudApiAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApiAccountApplication.class, args);
	}

}

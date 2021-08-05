package com.example.restworksop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RestWorksopApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWorksopApplication.class, args);
	}

}

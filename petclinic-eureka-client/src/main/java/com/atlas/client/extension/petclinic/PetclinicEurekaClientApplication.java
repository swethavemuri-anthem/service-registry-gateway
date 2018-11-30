package com.atlas.client.extension.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableCircuitBreaker
@EnableHystrixDashboard
public class PetclinicEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetclinicEurekaClientApplication.class, args);
	}
	
	@RequestMapping("/test/{name}")
	public String test(@PathVariable String name) {
		return "Hello "+name;
	}
}

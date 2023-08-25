package com.airlineEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AirlineEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineEurekaApplication.class, args);
	}

}

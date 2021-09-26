package com.example.microserviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class},scanBasePackages={"com.example.microserviceone.entity"})
@EntityScan("com.example.microserviceone.entity")
public class ConsumerFacingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerFacingServiceApplication.class, args);
	}

}

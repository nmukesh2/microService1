package com.example.microserviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EntityScan("com.example.microserviceone.entity")
public class ConsumerFacingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerFacingServiceApplication.class, args);
	}

}

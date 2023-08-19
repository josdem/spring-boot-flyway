package com.jos.dem.springboot.flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class FlywayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlywayDemoApplication.class, args);
	}

}


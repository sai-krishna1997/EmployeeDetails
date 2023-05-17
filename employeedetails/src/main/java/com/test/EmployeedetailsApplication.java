package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EmployeedetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeedetailsApplication.class, args);
		System.out.println("hello");
	}

}

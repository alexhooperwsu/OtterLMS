package com.otter.lms.otterlms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EnableMethodSecurity(securedEnabled = true)
public class WebDemoApplication {

	public static void main(String[] args) {
		for(var arg : args) {
			System.out.println(arg);
		}
		SpringApplication.run(WebDemoApplication.class, args);
	}

}

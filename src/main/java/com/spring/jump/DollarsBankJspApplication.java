package com.spring.jump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import ch.qos.logback.classic.spi.ClassPackagingData;

@SpringBootApplication(scanBasePackages = ".com.spring.jump")
public class DollarsBankJspApplication  extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DollarsBankJspApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(DollarsBankJspApplication.class, args);
	}

}

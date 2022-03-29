package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PublicDataProjectApplication {
	private static final Logger logger = LoggerFactory.getLogger(PublicDataProjectApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PublicDataProjectApplication.class, args);
		logger.debug("<============================= APPLICATION STARTED COMPLETE =============================>");
	}

}



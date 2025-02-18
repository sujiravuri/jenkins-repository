package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoForJenkinsApplication {

	public static Logger logger =

	LoggerFactory.getLogger(DemoForJenkinsApplication.class);

//	@PostConstruct
//	public void init()
//	{
//logger.info("Application Started....");
//	}



	public static void main(String[] args) {

		logger.info("Application Started....");

		SpringApplication.run(DemoForJenkinsApplication.class, args);
	}

}

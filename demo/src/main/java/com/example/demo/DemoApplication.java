package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DemoApplication {

public static Logger log = LoggerFactory.getLogger(DemoApplication.class);
	
	public void init()
	{
		log.info("Spring Boot Application Started......");
	}
	public static void main(String[] args) {
		log.info("Spring Boot Application Executed......");
		SpringApplication.run(DemoApplication.class, args);
	}

}

package com.jenkinsdemo.springexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	static Logger logger= LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	public void init() {
		logger.info("application started..");
	}

	public static void main(String[] args) {
		logger.info("application executed....");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}

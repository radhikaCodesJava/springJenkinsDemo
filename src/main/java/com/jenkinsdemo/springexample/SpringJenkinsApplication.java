package com.jenkinsdemo.springexample;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	static Logger logger= LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
	//	logger.info("application started..");
	}

	public static void main(String[] args) {
		logger.info("application executed....");
		logger.info("application executed second line");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}

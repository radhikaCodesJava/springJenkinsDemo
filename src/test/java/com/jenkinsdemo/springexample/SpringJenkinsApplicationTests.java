package com.jenkinsdemo.springexample;

//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger logger= LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	@Test
	public void contextLoads() {
		logger.info("test case executing..");
		logger.info("test case executing second statement");
		assertEquals(true, true);
	}

}

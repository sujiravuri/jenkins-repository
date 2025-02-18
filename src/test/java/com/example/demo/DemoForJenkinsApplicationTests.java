package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoForJenkinsApplicationTests {

	public static Logger logger =
			LoggerFactory.getLogger(DemoForJenkinsApplicationTests.class);
	@Test
	 public void contextLoads() {
		logger.info("Test Case Executing....");
	}

}

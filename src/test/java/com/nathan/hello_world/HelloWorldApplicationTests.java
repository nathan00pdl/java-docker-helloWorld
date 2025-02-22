package com.nathan.hello_world;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nathan.hello_world.controller.HelloWorldController;

@SpringBootTest
class HelloWorldApplicationTests {

	@Autowired
	private HelloWorldController helloWorldController;

	@Test
	void contextLoads() {
		assertNotNull(helloWorldController); // Ensures that the controller bean has been initialized
	}

}

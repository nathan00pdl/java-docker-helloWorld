package com.nathan.hello_world.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/*
 * MockMvc:
 * 
 * -> Simulation of an HTTP request to /api/hello endpoint.
 * -> Checking the response status.
 * -> Checking the content of the response.  
 */

@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldControllerTest {
    @Autowired  //Dependency Injection 
    private MockMvc mockMvc;

    @Test   
    public void shouldReturnExpectedMessage() throws Exception {
        mockMvc.perform(get("/api/hello")).andExpect(status().isOk()).andExpect(content().string("Hello World!"));
    }
}

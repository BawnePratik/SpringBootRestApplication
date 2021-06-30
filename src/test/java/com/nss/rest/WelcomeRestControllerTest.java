package com.nss.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.nss.resource.WelcomeRestController;

@WebMvcTest(value = WelcomeRestController.class)
public class WelcomeRestControllerTest {

	@Autowired
	private MockMvc mockMvc; //MockMvc is the component which is used to send a request which is given by WebMvc test framework
	 
	
	@Test  // To represent this method as a junit method we used @Test annotation
	public void test_welcomeMsg() throws Exception {
		
		//It is used to prepare the request//what request we need to send ... what is the url pattern
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome"); 
		
		//In order to send a request we have a MockMvc
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		
		//In order to check the response from the API
		int status = mvcResult.getResponse().getStatus();
		
		//For raw response
	//	String responseStr = mvcResult.getResponse().getContentAsString();
		
		//Im expecting 200 as a status code 
	//	assertThatNoException();
		assertEquals(201, status);
	}
	
}
	
	
	

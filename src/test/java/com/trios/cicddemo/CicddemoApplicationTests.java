package com.trios.cicddemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@WebMvcTest
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {CicddemoApplication.class})
class CicddemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testWelcome() throws Exception{
		this.mockMvc.perform(MockMvcRequestBuilders.get("/welcome")).andExpect(MockMvcResultMatchers.status().isOk());
	}

}

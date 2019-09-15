package com.example.ImageService.controllers;

import com.example.ImageService.repos.ImageRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ImageControllerTestWithMock {

    @Autowired
    private MockMvc mockmvc;

    @MockBean
    private ImageRepository imageRepository;

    @Autowired
    private WebApplicationContext webApplicationContextSetup;

    @Before
    public void setMockmvc() {
        this.mockmvc = webAppContextSetup(webApplicationContextSetup).build();
    }

    @Test
    public void home() throws Exception {
        this.mockmvc.perform(get("/images/home"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().string("Welcome to Image Application"));
    }

    @Test
    public void testGetImage() throws Exception {
        this.mockmvc.perform(get("/")).andExpect(status().isOk())
                .andExpect(content().contentType("application/hal+json;charset=UTF-8"));
    }
}

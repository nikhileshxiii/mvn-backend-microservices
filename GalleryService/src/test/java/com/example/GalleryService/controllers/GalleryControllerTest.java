package com.example.GalleryService.controllers;

import com.example.GalleryService.GalleryServiceApplication;
import com.example.GalleryService.entities.Gallery;
import com.example.GalleryService.service.GalleryService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = {GalleryServiceApplication.class})
@AutoConfigureMockMvc
public class GalleryControllerTest {

    private MockMvc mockMvc;

    @MockBean
    private GalleryService galleryService;

//    @Value("${local.server.port")
//    private String port;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void home() throws Exception {
        this.mockMvc.perform(get("/galleries/home"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content()
                        .string("Hello from Gallery Service")
                );
    }

    @Test
    public void getGalleryById() throws Exception {
        Gallery gallery = new Gallery();
        gallery.setId(2);
        gallery.setGalleryName("testgallery");
        when(galleryService.saveGallery(gallery)).thenReturn(gallery);
        this.mockMvc.perform(get("/galleries/2"))
                .andDo(print())
                .andExpect(status().isOk());
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
//                .andExpect((ResultMatcher) gallery);
    }

    @Test
    public void saveGallery() {
    }

    @Test
    public void homeAdmin() throws Exception {
        this.mockMvc.perform(get("/galleries/admin"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content()
                        .string("This is the admin area of Gallery service")
                );
    }
}

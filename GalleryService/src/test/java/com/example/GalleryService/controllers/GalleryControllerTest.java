package com.example.GalleryService.controllers;

import com.example.GalleryService.entities.Gallery;
import com.example.GalleryService.service.GalleryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GalleryControllerTest {
    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private GalleryController galleryController;

    @Autowired
    private MockMvc mockMvc;

//    @Autowired
    @Mock
    private GalleryService galleryService;

    @Value("${local.server.port")
    private String port;

    @Test
    public void home() throws Exception {
        this.mockMvc.perform(get("/"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content()
                        .string("Hello from Gallery Service running at port: " + port)
                );
    }

    @Test
    public void getGalleryById() throws Exception {
        Gallery gallery = new Gallery();
        gallery.setId(2);
        gallery.setGalleryName("testgallery");
        when(galleryService.saveGallery(gallery)).thenReturn(gallery);
        this.mockMvc.perform(get("/2")).andDo(print())
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) gallery);
    }

    @Test
    public void saveGallery() {
    }

    @Test
    public void homeAdmin() throws Exception {
        this.mockMvc.perform(get("/admin"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content()
                        .string("This is the admin area of Gallery service running at port: " + port)
                );
    }
}

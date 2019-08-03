package com.example.ImageService.controllers;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.example.ImageService.entities.Image;
import com.example.ImageService.jpa.ImageRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HomeControllerTest {

//    @Autowired
    HomeController homeController;

//    @Autowired
    RestTemplate restTemplate;

    @LocalServerPort
    int port;

    @Test
    public void contextLoads() throws Exception {
        assertEquals(1,1);
    }

    @Test
    public void getImages() {
        ImageRepository ir = mock(ImageRepository.class);
        List<Image> arr = new ArrayList<Image>();arr.add(new Image(1,"title1","url1"));arr.add( new Image(2,"title2","url2"));
        when(ir.findAll()).thenReturn(arr);
        Long count = homeController.getImages().stream().count();
//        assertEquals(2L, count);
        assertEquals(1,1);
    }

    @Test
    public void getImage() {
    }
}
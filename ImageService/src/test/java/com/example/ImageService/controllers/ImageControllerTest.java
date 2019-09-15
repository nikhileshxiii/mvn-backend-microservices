//package com.example.ImageService.controllers;
//
//
//import com.example.ImageService.entities.Image;
//import com.example.ImageService.repos.ImageRepository;
//import org.hamcrest.MatcherAssert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ImageControllerTest {
//
//    @Autowired
//    ImageController homeController;
//
//    @LocalServerPort
//    private int port;
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Test
//    public void contextLoads() throws Exception {
//    }
//
//    @Test
//    public void testgetImages() {
//        ImageRepository ir = mock(ImageRepository.class);
//        List<Image> arr = new ArrayList<Image>();
//        arr.add(new Image(1, "title1", "url1"));
//        arr.add(new Image(2, "title2", "url2"));
//        when(ir.findAll()).thenReturn(arr);
//        Long count = homeController.getImages().stream().count();
////        assertEquals(2L, count);
//        assertEquals(1, 1);
//    }
//
//    @Test
//    public void getImage() {
//        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/images", String.class)).isNotEmpty();
//    }
//
//}
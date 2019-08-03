package com.example.ImageService.config;

import com.example.ImageService.entities.Image;
import com.example.ImageService.jpa.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ApplicationRunner implements org.springframework.boot.ApplicationRunner
{

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        imageRepository.saveAll(
                Arrays.asList(
                new Image("Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
                new Image("The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
                new Image("The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112")
                )
        );
    }
}

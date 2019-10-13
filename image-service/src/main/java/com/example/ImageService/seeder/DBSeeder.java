package com.example.ImageService.seeder;

import com.example.ImageService.entities.Image;
import com.example.ImageService.repos.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        List<Image> images = Arrays.asList(
                new Image(1, "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
                new Image(2, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
                new Image(3, "The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"),
                new Image(4, "Meg Image1", "https://www.imdb.com/title/tt4779682/mediaviewer/rm2105506304"),
                new Image(4, "Meg Postor", "https://www.imdb.com/title/tt4779682/mediaviewer/rm1793159168"),
                new Image(4, "Meg Postor2", "https://www.imdb.com/title/tt4779682/mediaviewer/rm1979403776")
        );
        imageRepository.saveAll(images);

    }

}

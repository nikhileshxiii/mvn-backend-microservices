package com.example.ImageService.RandomSwitch;

import org.springframework.stereotype.Component;

@Component
public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public Integer something() {
        // TODO Auto-generated method stub
        return 5;
    }
}
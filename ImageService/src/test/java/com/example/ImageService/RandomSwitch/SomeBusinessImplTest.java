package com.example.ImageService.RandomSwitch;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessImplTest {

    @Mock
    DataService dataService;

    @InjectMocks
    SomeBusinessImpl someBusinessImpl;

    @Before
    public void setSomeBusinessImpl() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSomeBusinessImpl() {
        int res = someBusinessImpl.something();
        assertEquals(5, res);
    }
}

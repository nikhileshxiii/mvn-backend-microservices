package com.example.ImageService.RandomSwitch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessImplTest {

	@Mock 
	DataService dataService;
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;
	
	@Test
	public void testSomeBusinessImpl() {
		when(someBusinessImpl.something()).thenReturn(5);
		int res = someBusinessImpl.something();
		assertEquals(5, res);
		fail("Not yet implemented");
	}


}

package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfusedPappuTest {
	
	@InjectMocks
	ConfusedPappu confusedPappu;
	
	@Test
	void confusedPappuSuccessTest(){
		int response;
		response = confusedPappu.confusedPappu(56);
		assertEquals(3,response);
		
		response = confusedPappu.confusedPappu(66);
		assertEquals(33,response);
	}

}

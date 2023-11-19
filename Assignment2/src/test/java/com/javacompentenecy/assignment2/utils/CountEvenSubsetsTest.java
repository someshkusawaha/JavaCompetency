package com.javacompentenecy.assignment2.utils;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CountEvenSubsetsTest {
	
	@InjectMocks
	CountEvenSubsets countEvenSubsets;
	
	@Test
	void countEvenSubsetsSuccessTest(){
		Integer[] input = {4, 2, 1, 9, 2, 6, 5, 3};
		List<List<Integer>> response;
		response = countEvenSubsets.countEvenSubsets(input);
		assertNotEquals(0,response.size());
		
		
		Integer[] input1 = {10, 3, 4, 2, 4, 20, 10, 6, 8, 14, 
				2, 6, 9};
		response = countEvenSubsets.countEvenSubsets(input1);
		assertNotEquals(0,response.size());
	}

}

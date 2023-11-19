package com.javacompentenecy.assignment2.utils;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UniqueSubsetsTest {
	
    @InjectMocks
	UniqueSubsets uniqueSubsets;
    
    @Test
    void uniqueSubsetsSuccessTest() {
    	Integer[] input = {1,2,3,3};
    	List<List<Integer>> response = uniqueSubsets.uniqueSubsets(input);
    	assertNotNull(response);
    }
}

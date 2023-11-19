package com.javacompentenecy.assignment2.utils;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SieveOfEratosthenesTest {

	@InjectMocks
	SieveOfEratosthenes sieveOfEratosthenes;
	
	void sieveOfEratosthenesSuccessTest() {
		List<Integer> response = sieveOfEratosthenes.sieveOfEratosthenes(10);
		assertNotNull(response);
	}
}

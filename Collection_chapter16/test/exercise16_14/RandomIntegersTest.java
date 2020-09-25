package exercise16_14;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RandomIntegersTest {


	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void  insertElementTest(){
		
		Random randomNumber = new Random();
	
		List<Integer> values = new LinkedList<>();
		
		Integer sum = 0;
		
		for(int i = 0; i < 25; i++) {
			
			values.add(randomNumber.nextInt(100));
			
			sum += values.get(i);
		}
		
		Collections.sort(values);
		printlist(values);
		System.out.println(sum);
		
		
		
		
	}
	
	void printlist(List<Integer> list) {
		
		ListIterator<Integer> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
	}

}

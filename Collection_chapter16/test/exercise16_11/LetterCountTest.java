package exercise16_11;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LetterCountTest {
	
	LetterCount obj;
	@BeforeEach
	void setUp() throws Exception {
		
		obj = new LetterCount();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void countLetterOccurenceTest() {
		
		Map<Character, Integer> resultMap = obj.countLetters("HELLO THERE lll sentence");
		
		assertTrue(resultMap.containsKey('T') && resultMap.get('T') == 2);
		assertTrue(resultMap.containsKey('L') && resultMap.get('L') == 5);
		
		
		obj.printMap(resultMap);
		
		
	}
	
	@Test
	void RandomTest() {
		
		String name = "Yes and No";
		
		String replaced = name.replaceAll(" ", "");
		
		System.out.println(replaced.toString());
	}

}

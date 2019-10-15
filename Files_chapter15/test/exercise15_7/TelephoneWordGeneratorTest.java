package exercise15_7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TelephoneWordGeneratorTest {

	Telephone nokia;
	
	TelephoneDigits numbers;
	
	TelephoneWordGenerator wordObj = new TelephoneWordGenerator();	
	
	@BeforeEach
	void setUp() throws Exception {
		
		nokia = new Telephone();
		
		numbers = new TelephoneDigits();
		
		nokia.setMyPhoneNumber(numbers);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void telephoneNumberNotNullTest() {
		
		assertNotNull(nokia);
	}

	
	@Test
	void generateWordFromPhoneNumberTest() {
		
		wordObj.setThisPhone(nokia);
		
		assertNotNull(wordObj.getThisPhone());
		
		wordObj.writeWordToFile(7382273);
	
	}
	
	@Test
	void phoneDigitLessThan7digitsTest() {
		
		
		assertThrows(IllegalArgumentException.class, ()-> wordObj.writeWordToFile(382273));
	}
	
	@Test
	void generated2187WordsTest() {
		
		wordObj.setThisPhone(nokia);
		
		assertNotNull(wordObj.getThisPhone());
		
		wordObj.writeWordToFile(7382273);
		
		
		
	}
	
	
	

}

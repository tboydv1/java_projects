package exercise14_24;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpelliingCheckerTest {

	SpellingChecker util;
	
	@BeforeEach
	void setUp() throws Exception {
		
		util = new SpellingChecker();
		
		util.setDictionaryFile("/home/oluwatobi/Dev/java_project/Strings_chapter14/dictionary.txt");
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	
	@Test
	void dictionaryFileExistTest() throws IOException{
		
		assertNotNull(util.getDictionaryFile());
		
		Path file = Paths.get(util.getDictionaryFile());
		
		System.out.println();
		assertTrue(Files.exists(file));
		
		assertFalse(Files.isDirectory(file));
		
	}

	@Test
	void checkWordTest() {
		
		assertTrue(util.checkSpelling("animal"));
		assertTrue(util.checkSpelling("umbrella"));
		assertFalse(util.checkSpelling("ainimal"));
		
	}
	
	
//	void transposeWordsTest() {
//		
//		String word = "default";
//		
//		
//		
//	}
	
	

}

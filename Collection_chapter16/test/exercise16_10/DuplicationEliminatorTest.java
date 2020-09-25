package exercise16_10;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DuplicationEliminatorTest {

	DuplicateEliminator eliminatorProgram;
	@BeforeEach
	void setUp() throws Exception {
		
		eliminatorProgram = new DuplicateEliminator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void readDuplicateNamestest() throws IOException {
		
		Path file = Paths.get("/home/oluwatobi/Dev/java_project/Collection_chapter16/src/exercise16_10/names.txt");
		
		List<String> firstNames = eliminatorProgram.readNames(file);
		
		assertEquals("John", firstNames.get(0));
		assertEquals("Mary", firstNames.get(6));
		
	}
	
	@Test
	void randomTest() throws IOException {
		
		Scanner scan = new Scanner(Paths.get("/home/oluwatobi/Dev/java_project/Collection_chapter16/src/exercise16_10/names.txt"));
		
		while(scan.hasNext()) {
			
			System.out.println(scan.next());
		}
	}
	
	@Test
	void eliminateDuplicatesTest() throws IOException {
		
		Path file = Paths.get("/home/oluwatobi/Dev/java_project/Collection_chapter16/src/exercise16_10/names.txt");
		
		List<String> firstNames = eliminatorProgram.readNames(file);
		
		assertEquals("John", firstNames.get(0));
		assertEquals("Mary", firstNames.get(6));
		assertEquals("John", firstNames.get(4));
		assertEquals("Lisa", firstNames.get(3));
		assertEquals("Lisa", firstNames.get(9));
		assertEquals("Lisa", firstNames.get(8));
		
		Set<String> uniqueNames = eliminatorProgram.eliminateDuplicates(firstNames);
		
		for(String name: uniqueNames) {
			System.out.println(name);
		}

	}
	
	@Test 
	void searchNameTest() throws IOException {
		
		Scanner input = new Scanner(System.in);

		Path file = Paths.get("/home/oluwatobi/Dev/java_project/Collection_chapter16/src/exercise16_10/names.txt");
		
		List<String> firstNames = eliminatorProgram.readNames(file);
		
		assertEquals("John", firstNames.get(0));
		assertEquals("Mary", firstNames.get(6));
		assertEquals("John", firstNames.get(4));
		assertEquals("Lisa", firstNames.get(3));
		assertEquals("Lisa", firstNames.get(9));
		assertEquals("Lisa", firstNames.get(8));
		
		Set<String> uniqueNames = eliminatorProgram.eliminateDuplicates(firstNames);
		
		for(String name: uniqueNames) {
			System.out.println(name);
		}
		
		assertTrue(eliminatorProgram.searchName("Mary", uniqueNames));
		assertFalse(eliminatorProgram.searchName("brown", uniqueNames));
		assertTrue(eliminatorProgram.searchName("Lisa", uniqueNames));
		
	}
	
	

}

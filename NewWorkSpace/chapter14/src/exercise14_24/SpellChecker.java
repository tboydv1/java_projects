package exercise14_24;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SpellChecker {

	
	

	public boolean isSpelledCorrectly(String word , Dictionary file) {
		
		boolean search = true;
		
		//open dictionary file
		try(Scanner scan = new Scanner(Paths.get(file.getDictionaryFile()))){

			//while in a loop
			while(scan.hasNext()) {
				
				System.out.println(scan.next());
			}
			
		} 
		catch (IOException | NoSuchElementException  e) {
			
			System.err.println("Error processing file");
			e.printStackTrace();
		}
		
		return false;
	}
	
}

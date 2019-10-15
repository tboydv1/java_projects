package exercise14_17;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class StringCreator {

	private String word;
	
	private String dictionary = "/home/oluwatobi/Dev/java_project/Strings_chapter14/dictionary.txt";
	
	public void readFiveLetterWord(String word) {
		
		if(word.matches("[A-Za-z]{5}") == false) {
			
			throw new IllegalArgumentException("Argument must be five letter words");
		}
		
		this.word = word;
		
	}
	
	public String getWord() {
		
		return this.word;
	}
	
	public void produceThreeLetterWords() {
		
		String fiveLetterWord = getWord();
		
		try(Formatter output = new Formatter("threeLetterwords.txt");) {
		for(int i = 0; i < 5; i++) {
			
			char letter1 = fiveLetterWord.charAt(i);
			
			for(int j = 0; j < 5; j++) {
				
				char letter2;
				
				letter2= fiveLetterWord.charAt(j);
				
				for(int k = 0; k < 5; k++) {
					
					char letter3 = fiveLetterWord.charAt(k);
					 
					String word = Character.toString(letter1).concat(Character.toString(letter2).concat(Character.toString(letter3)));
					
//					if(compareDictionaryFile(word) == true)
						output.format("%s%n", word);
						
				}
				
			}
		}
	}
	catch(IOException e) {
		
		System.err.println("Error writing to file");
		
	}
	}
	
	
	
	public boolean compareDictionaryFile(String words) {
		
		String dictionaryWord;
		try(Scanner fileObj = new Scanner(Paths.get(dictionary))){
			
			while(fileObj.hasNext()) {
				
				dictionaryWord = fileObj.next();
				
				if(dictionaryWord == word) {
					return true;
				}
				
			}
			
		} 
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		return false;
		
	}
	
	
	
	
}

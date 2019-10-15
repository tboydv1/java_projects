package exercise14_24;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class SpellingChecker {

	private String dictionaryFile;
	
	
	
	public String getDictionaryFile() {
		return dictionaryFile;
	}



	public void setDictionaryFile(String dictionaryFile) {
		this.dictionaryFile = dictionaryFile;
	}



	public boolean checkSpelling(String userWord) {
		
		if(userWord.matches("[A-Za-z]+") == false) {
			throw new IllegalArgumentException("Invalid word");
		}
	
		String dictWords;
		
		try(Scanner fileObj = new Scanner(Paths.get(dictionaryFile))){
			
			while(fileObj.hasNext()) {
				
				dictWords = fileObj.next();
				
				if(dictWords.equals(userWord)) {
					
					printMessage(true, dictWords);
					return true;
				}
				
			}
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		printMessage(false, userWord);
		return false;
		
	}
	
	public void printMessage(boolean args, String word) {
		
		if(args == true) {
			
			System.out.printf("Word is spelt correctly -> %s%n", word);
		}
		else
			System.out.printf("Word is not spelt correctly -> %s%n", word);
			
	}
	
	public void suggestCorrectWord(String userWord) {
		
		if(checkSpelling(userWord) == false) {
			
			
		}
		
		
		
	}
}

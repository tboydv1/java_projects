package exercise14_25;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Puzzle {

	private List <String> wordList;
	
	public Puzzle(Path file) {
		
		this.setWordList(getListFromFile(file));
		
	}
	
	public List<String> getWordList() {
		return wordList;
	}

	public void setWordList(List<String> wordList) {
		this.wordList = wordList;
	}
	
	public List<String> getListFromFile(Path wordlistPath)  {
		
		List<String> words = new ArrayList<>();
		

		
		try(Scanner scan = new Scanner(Paths.get(wordlistPath.toString()))){
		String line;
		
		while(scan.hasNext()) {
			
			line = scan.next();
			if(line.matches("[A-Za-z]+"))
				words.add(line);
			else 
				throw new InputMismatchException("line must be a string");
		}
		
		}
		catch(IOException io) {
			
			System.err.println("Error reading puzzle from file");
			System.exit(1);
		}
		
		return words;
			
	}
	
	public void sortWords() {
		
		Collections.sort(getWordList(), Collections.reverseOrder());
		
	}
	
	
}

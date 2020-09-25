package exercise16_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * 
 * 16.13 (Counting Duplicate Words) Write a program that determines and
prints the number of duplicate words in a sentence. Treat uppercase and
lowercase letters the same. Ignore punctuation.
 */
public class DuplicateWordCount {

	public List<String> countDuplicateWord(String sentence) {
		
		String[] words = sentence.split(" ");
		
		List<String> duplicates = new ArrayList<>();
		
		String temp;
		int count = 0;
		
		for(int i = 0; i < words.length; i++) {
			
			temp = words[i];
			count = 0;
			for(int j = 0; j < words.length; j++) {
				
				if(words[j].equalsIgnoreCase(temp)) {
					
					count++;
				}
			}
			if(count > 1) {
				
				
				if(duplicates.contains(temp) == false)
					duplicates.add(temp.toLowerCase());
			}
		}
		
		return duplicates;
			
		
		
	}
	
	
}

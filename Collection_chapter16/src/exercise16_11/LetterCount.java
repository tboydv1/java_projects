package exercise16_11;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LetterCount {

	
	public Map <Character, Integer> countLetters(String sentence){
		
		//pick a character
		char temp;
		
		String modifiedString = sentence.replaceAll(" ", "").toUpperCase();
		
		
		Map<Character, Integer> letterMap = new HashMap<>();
		
		for(int i = 0; i < modifiedString.length(); i++) {
			
			
			temp = modifiedString.charAt(i);
			
			//count occurence
			letterMap.put(temp, countOccurence(modifiedString, temp));
			
		}
		
		return letterMap;
		
	}
	
	public int countOccurence(String sentence, char letter) {
		
		int wordCount = 0;
		Character tempChar;
		
		for(int i = 0; i < sentence.length(); i++) {
			
			tempChar = Character.toLowerCase(sentence.charAt(i));
			
			if(tempChar == Character.toLowerCase(letter)) {
				
				wordCount++;
				
			}
		}
		
		return wordCount;
	}
	
	public void printMap(Map<Character, Integer> map ) {
		
		Set<Character> key = map.keySet();
		System.out.printf("Letter Occurence %n");
		for(Character value: key) {
			
			System.out.printf("%c's\t\t%d%n", value, map.get(value));
		}
		
	}
}

package exercise14_12;

public class AlphabetSearcher {

	private int[] letterOccurrence = new int[26];
	private char[] letters = {
		'a', 'b','c','d', 'e','f','g','h','i',
		'j','k','l','m','n','o','p','q','r','s','t',
		'u','v','w','x','y','z'
	};
	
	
	private String sentence;
	
	
	
	public String getSentence() {
		
		return this.sentence;
	}
	
	public int getCharIndex(char ch) {
		
		for(int i = 0; i < letters.length; i ++) {
			
			if(getLetters()[i] == ch)
				return i;
		}
		
		return -1;
		
	}
	
	
	
	public int[] getLetterOccurrence() {
		return letterOccurrence;
	}

	public void setLetterOccurrence(int[] letterOccurrence) {
		
		this.letterOccurrence = letterOccurrence;
	}

	public char[] getLetters() {
		return letters;
	}

	public void setLetters(char[] letters) {
		this.letters = letters;
	}

	public void setSentence(String sentence) {
		
		if(sentence.matches("([A-Za-z]+\\s*[A-Za-z]*)*")) {
			this.sentence = new String(sentence);
		}
		else
			throw new IllegalArgumentException("Invalid input");
	}
	
	public void print() {
		
		System.out.printf("%n%s\t%s%n", "letters", "Occurence");
		
		for(int i = 0; i < letters.length; i ++) {
			
			
				System.out.printf("%n%8s\t%d%n",letters[i], letterOccurrence[i]);

		}
		
	}
	
	public int countUpperCaseLetter(char ch) {
		
		char toUpper = Character.toUpperCase(ch);
		
		int count = 0, index, startIndex = 0;
		
		index = getSentence().indexOf(toUpper, startIndex);
	
		count += 1;
		
		startIndex = index + 1;
		
		for(int i = index; i < getSentence().length(); i++) {
			
			index = getSentence().indexOf(toUpper, startIndex);
			
			if(index >= 0) {
				
				count += 1;
				
				startIndex = index + 1;
			}
			
		}
		
		return count;
	}
	
	public int countLowerCaseLetter(char ch) {
		
		char toLower = Character.toLowerCase(ch);
		
		int count = 0, index, startIndex = 0;
		
		index = getSentence().indexOf(toLower, startIndex);
//		
		count += 1;
		
		startIndex = index + 1;
		
		for(int i = index; i < getSentence().length(); i++) {
			
			index = getSentence().indexOf(toLower, startIndex);
			
			if(index >= 0) {
				
				count += 1;
				
				startIndex = index + 1;
			}
			
		}
		
		return count;
		
	}
	
	public int countLetterOccurence(char letter) {
		
		int upperCount,lowerCount;
		
		upperCount = countUpperCaseLetter(letter);
		
		lowerCount = countLowerCaseLetter(letter);
		
		int totalOccurence = upperCount + lowerCount;
		
		
		return totalOccurence;
		
		
	}
	
	public int storeLetterOccurrence() {
		
		int letterCount = 0;
		
		for(int i = 0; i < getSentence().length(); i++) {
		
			char currentLetter = getSentence().charAt(i);
			
			 letterCount = countLetterOccurence(currentLetter);
			 
			if(getCharIndex(currentLetter)== -1) {
					continue;
			}
			getLetterOccurrence()[getCharIndex(currentLetter)] = letterCount;
			
			}
		
		return letterCount;
		
	}
	
	
	

}

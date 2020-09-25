package exercise14_13;

public class WordPrinting {
	
	private String[]  words; 
	
	private String sentence;
	
	public WordPrinting(String sentence) {
		
		if(sentence.matches("([A-Za-z]+\\s*[A-Za-z]*)*")){
			this.sentence = sentence;
		}
		else
			throw new IllegalArgumentException("Invalid sentence");
		
	}

	public String[] getWords() {
		return words;
	}

	public void setWords(String[] words) {
		this.words = words;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		
		if(sentence.matches("([A-Za-z]+\\s*[A-Za-z]*)*")){
			this.sentence = sentence;
		}
		else
			throw new IllegalArgumentException("Invalid sentence");
	}
	
	public void tokenizeSentence() {
		
		words = getSentence().split(" ");
		
	}
	
	public String[] returnWordsStartingWithCharacter(char letter) {
		
		String[] specialWord = new String[getWords().length];
		
		Character elementAtIndex;
		int index = 0;
		
		for(String element: getWords()) {
			
			elementAtIndex = element.charAt(0);
			if( elementAtIndex.equals(Character.toUpperCase(letter)) || 
					elementAtIndex.equals(Character.toLowerCase(letter))) {
				
				specialWord[index] = element;
				index += 1;
				
			}
		}
		printWords(specialWord);
		
		return specialWord;
		
	}
	
	private void printWords(String[] array) {
		
		for(String word: array) {
			
			if(word != null)
				System.out.printf("%s %n", word);
			
		}
	}
	
	

}

package exercise14_11;

public class CharacterSearch {

	private String sentence;
	
	private int characterTotalCount;
	
	
	public int getCharacterTotalCount() {
		return characterTotalCount;
	}

	public void setCharacterTotalCount(int characterCount) {
		this.characterTotalCount = characterCount;
	}

	public void setSentence(String sentence) {
		
		if(sentence.matches("([A-Za-z]+\\s*[A-Za-z]*)*")){
			
			this.sentence = new String(sentence);
		}
		else
			throw new IllegalArgumentException("Invalid sentence format");
		
		
	}
	
	public String getSentence() {
		
		return sentence;
		
	}
	
	public int findCharacterOccurence(char letter) {
		
		//find first occuernce of character
		if(doesExist(letter) == false) {
			throw new IllegalArgumentException("Character does not exist in string");
		}
		
		
		int count = 0, startIndex = 0;
		
		int indexOf = getSentence().indexOf(letter, startIndex);
		
		characterTotalCount += 1;
		
		startIndex = indexOf + 1;
		
		for(int i = indexOf; i < getSentence().length(); i++) {
			
			indexOf = getSentence().indexOf(letter, startIndex);
			
			if(indexOf > 0) {
				
				characterTotalCount += 1;
				startIndex = indexOf + 1;
			}
			
		}
		
		return indexOf;
	}
	
	public int findCapitalLetterOccurence(char letter) {

		
		int count = 0, startIndex = 0, upperCaseCount = 0;
		
		char toUpper = Character.toUpperCase(letter);
		
		int indexOf = getSentence().indexOf(toUpper, startIndex);
		
		 upperCaseCount += 1;
		
		startIndex = indexOf + 1;
		
		for(int i = indexOf; i < getSentence().length(); i++) {
			
			indexOf = getSentence().indexOf(toUpper, startIndex);
			
			if(indexOf > 0) {
				
				upperCaseCount += 1;
				startIndex = indexOf + 1;
			}
			
		}
		
		return upperCaseCount;
		
	}
	
	public int findLowerLetterOccurence(char letter) {

		
		int count = 0, startIndex = 0, lowerCaseCount = 0;
		
		char toUpper = Character.toLowerCase(letter);
		
		int indexOf = getSentence().indexOf(toUpper, startIndex);
		
		 lowerCaseCount += 1;
		
		startIndex = indexOf + 1;
		
		for(int i = indexOf; i < getSentence().length(); i++) {
			
			indexOf = getSentence().indexOf(toUpper, startIndex);
			
			if(indexOf > 0) {
				
				lowerCaseCount += 1;
				startIndex = indexOf + 1;
			}
			
		}
		
		return lowerCaseCount;
		
	}

	
	public boolean doesExist(char character) {
		
		if (getSentence().indexOf(character) == -1) {
			return false;
		}
		return true;
		
	}
}

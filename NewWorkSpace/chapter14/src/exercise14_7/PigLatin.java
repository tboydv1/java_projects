package exercise14_7;

public class PigLatin {

	String[] tokens;

	public String[] getTokens() {
		return tokens;
	}

	public void setTokens(String[] tokens) {
		this.tokens = tokens;
	}
	
	public void tokenizeWords(String sentence) {
		
		if(sentence.matches("([a-zA-Z]+\\s[a-zA-Z]+)*"))	
			this.tokens = sentence.split(" ");	
		else
			throw new IllegalArgumentException();
		
	}
	
	public static String printLatinWord(String word) {
		
		StringBuilder latin = new StringBuilder(word);
		
		char firstChar = latin.charAt(0);
		
		latin.deleteCharAt(0);
		
		latin.append(firstChar)
			 .append("ay");
	
		System.out.printf("\"%s\" -- %s%n", word, latin.toString());
		
		return String.format(latin.toString());
	}
}

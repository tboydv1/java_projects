package exercise14_9;

public class StringReversal {

	String[] tokens;

	public String[] getTokens() {
		return tokens;
	}

	public void setTokens(String[] tokens) {
		this.tokens = tokens;
	}
	
	public void tokenizeString(String sentence) {
		
		tokens = sentence.split(" ");
		
	}
	
	public String reverseTokens() {
		
		StringBuilder reversedTokens = new StringBuilder();
		
		for(int i = 0; i < tokens.length; i++) {
			
			reversedTokens.insert(0, tokens[i])
						  .insert(0, " ");
		}
		
		return String.format("%s", reversedTokens.toString());
	}
}

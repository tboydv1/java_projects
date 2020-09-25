package exercise14_3;

public class StringComparator {

	private String userInput1;
	private String userInput2;
	
	public String getUserInput1() {
		return userInput1;
	}
	public void setUserInput1(String userInput1) {
		
		if(userInput1.matches("[A-Za-z]*\\d*")) 
			this.userInput1 = userInput1;
		else
			throw new IllegalArgumentException();
	}
	public String getUserInput2() {
		return userInput2;
	}
	public void setUserInput2(String userInput2) {
		
		if(userInput2.matches("[A-Za-z]*\\d*")) 
			this.userInput2 = userInput2;
		else
			throw new IllegalArgumentException();
		
	}
	
	
}

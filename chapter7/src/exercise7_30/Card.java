package exercise7_30;

public class Card {

	private String face; 
	private String suits;
	
	public Card(String cardFace, String cardSuits) {
		
		this.face = cardFace;
		this.suits = cardSuits;
	}
	
	public String toString() {
		
		return face + " of " + suits;
	}
	public String getFace() {
		
		return face; 
	}
	
	public String getSuits() {
		
		return suits;
	}
	
}

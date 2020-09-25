package exercise7_30;

import java.security.SecureRandom;

public class DeckOfCard {

	Card[] deck; 
	
	int currentCard;
	
	private final int NUMBER_OF_CARDS = 52;
	
	SecureRandom range = new SecureRandom();
	
	public DeckOfCard() {
		
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
							"Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		deck = new Card[NUMBER_OF_CARDS];
		
		currentCard = 0;
		
		for(int count = 0; count < deck.length; count++) {
			
			deck[count] = new Card(faces[count % 13], suits[count /13]);
			
		}
	}
	
	public void shuffle() {
		
		currentCard = 0; 
		int other;
		
		for(int i = 0; i < deck.length; i++) {
			
			other = range.nextInt(51);
			
			Card temp = deck[i];
			deck[i] = deck[other];
			deck[other] = temp;
			
		}
	}
	
	public Card dealCard() {
	
		if(currentCard < deck.length) {
			return deck[currentCard++];
		}
		else
			return null;
	}
	
	public boolean hasAPair(Card[] array) {
		String temp = " ", temp2 = " ";
		int count = 0;
		
		for(int first = 0; first < array.length; first++) {
		
			temp = array[first].getFace();
			
		for(int rest = 0; rest < array.length; rest++) {
			
					temp2 = array[rest].getFace();
					if(rest == first)
						continue;
					if(temp == temp2) 
						count++;
							
			}
		}
			if(count == 2)
				return true;
			else
					return false;
		
	}
	
	public boolean hasTwoPair(Card[] array) {
		String temp, temp2;
		int count = 0;
		for(int first = 0; first < array.length; first++) {
			
			temp = array[first].getFace();
			
		for(int rest = 0; rest < array.length; rest++) {
			
				temp2 = array[rest].getFace();
				
				if(rest == first)
					continue;
				
				if(temp == temp2)
					count++;
		}
	}
			if(count == 4)
				return true;
			else
				return false;

	}
	
	public boolean hasThreeKind(Card[] array) {
		String temp, temp2, temp3;
		
		for(int first = 0; first < array.length; first++) {
			
			temp = array[first].getFace();
			
		for(int next = 0; next < array.length; next++) {
			
				temp2 = array[next].getFace();
				
			for(int last = 0; last < array.length; last++) {	
				
				temp3 = array[last].getFace();
				
				if(first == next  || first == last || next == last)
					continue;
				
				
				if(temp == temp2 && temp == temp3)
					return true;
			}
		}
	}
			
			return false;
				
	}
	
}

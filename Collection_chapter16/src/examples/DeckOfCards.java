package examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

		
		private List <Card> list;
		
		public DeckOfCards() {
			
			Card[] deck = new Card[52]; //create a deck that can take 52 cards
			int count = 0;
			
			for(Card.Suit suit : Card.Suit.values()) {
				
				for(Card.Face face: Card.Face.values()) {
					
					deck[count] = new Card(face, suit);
					++count;
				}
				
			}
			
			list = Arrays.asList(deck); //convert array to list
			
			Collections.shuffle(list); //shuffle list elements
			
			
		}
		
		public void printCards() {
			
			for(int i = 0; i < list.size(); i++) {
				
				System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? System.lineSeparator() : "");
			}
		}
		
		public static void main(String args[]) {
			
			DeckOfCards cards = new DeckOfCards();
			cards.printCards();
		}
	
}

package exercise7_30;

public class DeckOfCardsTest {
	static DeckOfCard casino = new DeckOfCard();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		casino.shuffle();
		
//		for(int i = 1; i <= 52; i++) {
//			
//			System.out.printf("%-20s", casino.dealCard());
//			
//			if(i % 4 == 0) {
//				System.out.println();
//			}
//		}
		System.out.println();
		handDeal();
	}
	public static void handDeal() {
		Card piece;
		Card[] hand = new Card[5];
		
		casino.shuffle();
		
		for(int n = 0; n < 5; n++) {
			
			piece = casino.dealCard();
			
			hand[n] = piece;
		}
		
		for(Card j: hand) {
			System.out.println(j);
		}
		
		System.out.println("\n"+casino.hasThreeKind(hand) + " three kind");
		System.out.println(casino.hasAPair(hand) + " a pair");
		System.out.println(casino.hasTwoPair(hand) + " two pair");
//		System.out.println(casino.hasFourKind(hand));

		
	}

}

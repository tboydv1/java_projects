package exercise6_29;
import java.util.Random;
public class CoinTossing {

	private enum Coins {HEADS, TAILS};
	
	public static void tossCoin(int count) {
	
		Random generic = new Random();
		int side, heads = 0, tails = 0;
		for(int y = 1; y <= count; y++) {
			
			side = generic.nextInt(2);
			if(side == 0) {
				tails++;
			}
			else
				heads++;
		}
		
		System.out.printf("HEADS = %d, TAILS = %d%n%nCoin lands on %s!", heads, tails, flip());
		
		
	}
	public static Coins flip() {
		Random game = new Random();
		int value = game.nextInt(2);
		Coins side;
		
		if(value == 1) {
		 side = Coins.HEADS;
		}
		else
			side = Coins.TAILS;
		
		return side;
		
			
	}
}

package exercise7_28;

public class Tortoise {

	private final int fastPlod = 3;
	private final int slip = -6;
	private final int slowPlod = 1;
	
	
	
	public int move(int range) {
		
		if(range >= 1 && range <= 5) {
			 return fastPlod;
		}
		else if(range >= 6 && range <= 7) {
			return slip;
		}
		else {
			return slowPlod;
		}
	}
	
	
}

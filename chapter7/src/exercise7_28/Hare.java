package exercise7_28;

public class Hare {

	
	private final int bigSlip = -12;
	private final int bigHop = 9;
	private  final int sleep = 0;
	private final int smallHop = 1;
	private final int smallSlip = -2;
	
	
	public int move(int type) {
		
		switch(type) {
		case 1: case 2: 
			return sleep;
			
			
		case 3: case 4: 
			return bigHop;
			
		case 5: 
			return bigSlip;
			
		case 6:  case 7: case 8: 
			return smallHop;
			
		case 9: case 10: 
			return smallSlip;
			
			default:
				return sleep;
		}
	}
}

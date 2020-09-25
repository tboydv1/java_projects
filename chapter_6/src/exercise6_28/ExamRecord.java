package exercise6_28;

public class ExamRecord {
	
	
	
	public static double divide(double x, double y) {
		double quotient = x / y;
		return quotient;
	}
	public static int qualityPoints(double average) {
		int result = 0;
		
		double points = divide(average, 10);
		
		switch((int)points){
			case 9: case 10:
				result = 4;
				break;
				
			case 8:
				result = 3;
				break;
				
			case 7:
				result = 2;
				break;
				
			case 6:
				result = 1;
				break;
				
				default:
					result = 0;
		}
			return result;
	}
	
}

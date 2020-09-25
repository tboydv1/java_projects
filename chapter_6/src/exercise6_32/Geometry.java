package exercise6_32;


public class Geometry {

	static double x2;
	static double x1;
	static double y2;
	static double y1;
	
	public static double findDistance() {
		double dist = Math.sqrt(calculate_x() + calculate_y());
		return dist;
	}
	
	public static double calculate_x() {
			double diff = 0;
		if(x2 > x1) {
			 diff = Math.pow(x2 - x1, 2);
		}
		else if (x1 > x2) {
			diff = Math.pow(x1 - x2, 2);
		}
		return diff;
		
	}
	public static double calculate_y() {
		double diff = 0;
		if(y2 > y1) {
			 diff = Math.pow(y2 - y1, 2);
		}
		else if (y1 > y2) {
			diff = Math.pow(y1 - y2, 2);
		}
		return diff;
	}

}

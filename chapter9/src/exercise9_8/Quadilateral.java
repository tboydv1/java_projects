/**
 * 
 */
package exercise9_8;

/**
 * @author tboydev
 *
 */
public class Quadilateral {

	
	private Points []shapePoints = new Points[4];
	private Points pointA = new Points();
	private Points pointB = new Points();
	private Points pointC = new Points();
	private Points pointD = new Points();
	
	public Quadilateral() {
		
		shapePoints[0] = pointA;
		shapePoints[1] = pointB;
		shapePoints[2] = pointC;
		shapePoints[3] = pointD;
	}
	

	public Points[] getShapePoints() {
		
		return shapePoints;
	}

	public void setShapePoints(Points[] shapePoints) {
		
		this.shapePoints = shapePoints;
	}
	
	public double calculateDistanceBetweenPoints(Points pointsA, Points pointB) {
		
		double distance = Math.sqrt(Math.pow(findDiff(pointsA.getxCordinates(), pointB.getxCordinates()), 2)
				+ Math.pow(findDiff(pointsA.getyCordinates(), pointB.getyCordinates()), 2));
		
		
		return distance;
	
	}
	
	private double findDiff(int x1, int x2) {
		
		double diff = 0;
		
		if(x1 > x2) { 
			
			return diff = x1 - x2;
		}
		else if(x2 > x1) {
			
			return diff = x2 - x1;
		}
		
		return diff;
	}

	
	
}

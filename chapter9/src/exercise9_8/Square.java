/**
 * 
 */
package exercise9_8;

/**
 * @author tboydev
 *
 */
public class Square extends Quadilateral {

	
	private double length;
	

	public double getLength() {
		return length;
	}

	public void setLength(Points pointA, Points pointB) {
		
		
		this.length = super.calculateDistanceBetweenPoints(pointA, pointB);
	} 
	
	
	public double calculateArea() {
		
		double area = Math.pow(getLength(), 2);
		
		return area;
	}
	
	
}

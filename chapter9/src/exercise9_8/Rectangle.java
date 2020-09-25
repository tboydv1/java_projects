/**
 * 
 */
package exercise9_8;

/**
 * @author tboydev
 *
 */
public class Rectangle extends Quadilateral {

	private double width;
	private double length;
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(Points pointA, Points pointB) {
		
		this.width = calculateDistanceBetweenPoints(pointA, pointB);
	}
	public double getLength() {
		return length;
	}
	public void setLength(Points pointA, Points pointC) {
		
		this.length = calculateDistanceBetweenPoints(pointA, pointC);
	}
	
	public double calculateArea() {
		
		double area = getWidth() * getLength();
		
		
		return area;
		
	}
	
	//methods created for testing purposes
	//returns formatted values for length and width.
	public String lenght() {
		
		return String.format("%.0f", this.length);
	}
	
	public String width() {
		
		return String.format("%.0f", this.width);
	}
	
	
	
	
	
	
	
}

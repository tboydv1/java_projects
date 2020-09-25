/**
 * 
 */
package exercise8_4;

/**
 * @author tboydev
 *
 */
public class Rectangle {

	private double length = 1;
	private double width = 1;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double calculatePerimeter() {
		if(getLength() < 0 || getWidth() < 0)
			throw new IllegalArgumentException("Length and Width of a rectangle cannot be negative");
		double perimeter = 2 * (getLength() + getWidth());
		return perimeter;
	}
}

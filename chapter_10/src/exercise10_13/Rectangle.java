package exercise10_13;

public class Rectangle extends TwoDimensionalShape {

	private double width = 12, length = 18;

	
	public double getWidth() {
		return width;
	}

	
	public void setWidth(double width) {
		this.width = width;
	}

	
	public double getLength() {
		return length;
	}

	
	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		
		return getWidth() * getLength();
		
	}
	
	@Override
	public String toString() {
		
		return String.format("%sThis is Rectangle Object\n", super.toString());
	}
	
	
}

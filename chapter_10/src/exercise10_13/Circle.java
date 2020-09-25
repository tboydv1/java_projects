package exercise10_13;

public class Circle extends TwoDimensionalShape{
	
	private double radius = 15;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		
		this.radius = radius;
	}
	
	public double getArea() {
		
		double area = Math.PI * Math.pow(getRadius(), 2);
		
		return area;
	}
	
	@Override
	public String toString() {
		
		return String.format("%sThis is Circle Object\n", super.toString());
	}
}

package exercise10_13;

public class Cylinder extends ThreeDimensionalShape{

	private double radius = 8;
	private double height = 15;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		
		double area;
		
		area = 2 * Math.PI * getRadius() * getHeight() + 
				2 * Math.PI * Math.pow(getRadius(), 2);
		
		return area;
	}
	
	public double getVolume() {
		
		double volume;
		
		volume = Math.PI * Math.pow(getRadius(), 2) * getHeight();
		
		return volume;
		
	}
	
	@Override
	public String toString() {
		
		return String.format("%sThis is a Cylinder Object\n", super.toString());
	}
	
	
	
	
	
}

package exercise10_13;

public class Cone extends ThreeDimensionalShape{

	private double radius = 7;
	private double height = 12;
	
	
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
	
	@Override
	public double getArea() {
		
		double area = Math.PI * getRadius() * 
				(getRadius() + Math.sqrt(Math.pow(getHeight(), 2) + 
				Math.pow(getRadius(), 2)));
		
		return area;
	}
	
	@Override
	public double getVolume() {
		double volume;
		
		volume = Math.PI * Math.pow(getRadius(), 2) * getHeight() / 3;
		
		return volume;
	}
	
	@Override
	public String toString() {
		
		return String.format("%sThis is Cone Object\n", super.toString());
	}
	
	
	
	
	
	
}

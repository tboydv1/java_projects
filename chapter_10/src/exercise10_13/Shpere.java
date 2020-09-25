package exercise10_13;

public class Shpere extends ThreeDimensionalShape{

	private double radius = 12;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		
		double area = 4 * Math.PI * Math.pow(getRadius(), 2);
		
		return area;
		
	}
	
	public double getVolume() {
		
		double volume = (4 / 3) * Math.PI * Math.pow(getRadius(), 3);
		
		return volume;
	}
	
	@Override
	public String toString() {
		
		return String.format("%sThis is a Sphere Object\n", super.toString());
	}
}

package exercise10_13;

public abstract class TwoDimensionalShape extends Shape{

	
	
	public abstract double getArea();
	
	@Override
	public String toString() {
		
		return String.format("%sThis is Two-Dimentsional shape\n", super.toString());
	}
	
}

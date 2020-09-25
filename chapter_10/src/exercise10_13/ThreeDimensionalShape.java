package exercise10_13;

public abstract class ThreeDimensionalShape extends Shape {

	
	
	public abstract double getArea();
	

	public abstract double getVolume();
	
	
	
	@Override
	public String toString() {
		
		return String.format("%sThis is Three-Dimentsional shape\n", super.toString());
	}
}

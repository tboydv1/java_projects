package exercise10_13;

public class Parallelogram extends TwoDimensionalShape{

	private double base = 12, height = 9;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		
		double area = getBase() * getHeight();
		
		return area;
	
		
	}
	
	@Override
	public String toString() {
		
		return String.format("%sThis is a Parallelogram Object\n", super.toString());
	}
}

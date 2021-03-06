package exercise10_13;

public class Kite extends TwoDimensionalShape{

	private double pDiagonal = 15;
	private double qDiagonal = 24;
	
	public double getpDiagonal() {
		return pDiagonal;
	}
	
	public void setpDiagonal(double pDiagonal) {
		this.pDiagonal = pDiagonal;
	}
	
	public double getqDiagonal() {
		return qDiagonal;
	}
	
	public void setqDiagonal(double qDiagonal) {
		this.qDiagonal = qDiagonal;
	}
	
	@Override
	public double getArea() {
		
		double area = getpDiagonal() * getqDiagonal() / 2;
		
		return area;
		
	}
	
	@Override
	public String toString() {
		
		return String.format("%sThis is Kite\n", super.toString());
	}
	
	
}

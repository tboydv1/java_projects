package exercise10_13;

public class Cube extends ThreeDimensionalShape{

	
	private int edge = 7;

	public int getEdge() {
		return edge;
	}

	public void setEdge(int edge) {
		this.edge = edge;
	}
	
	public double getVolume() {
		
		double volume = Math.pow(getEdge(), 3);
		
		return volume;
				
	}
	
	public double getArea() {
		
		double area = 6 * Math.pow(getEdge(), 2);
		
		return area;
		
		
	}
	
	@Override
	public String toString() {
		
		return String.format("%sThis is a Cube Object\n", super.toString());
	}
}

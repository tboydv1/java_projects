package turtleGraphics;

public class SketchPad {

	
	private int[][] floor;
	private final int FLOOR_LENGHT = 20;
	
	public SketchPad() {
		
		this.floor = new int[FLOOR_LENGHT][FLOOR_LENGHT];
	}
	
	public int[][] accessSketchPad() {
		
		return floor;
	}
	
}

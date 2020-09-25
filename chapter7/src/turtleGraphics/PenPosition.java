package turtleGraphics;

public enum PenPosition {

	
	UP(1),
	DOWN(2);
	
	
	private final int value;
	
	private PenPosition(int id) {
		
		this.value = id;
	}
	
	public int getValue() {
		return value;
	}

}


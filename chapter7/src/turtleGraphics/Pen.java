package turtleGraphics;

public class Pen {

	
	private PenPosition currentPosition = PenPosition.UP;
	
	
	public void setCurrentPosition(PenPosition newPosition) {
		this.currentPosition = newPosition;
	}
	
	public PenPosition getCurrentPosition() {
		return this.currentPosition;
	}
	
}

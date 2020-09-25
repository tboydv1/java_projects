package chapter7_exercise21;

public class Turtle {

	
	private int currentRow;
	private int currentCol;
	
	private DrawingPen turtlePen;
	
	private TurtleDirection currentDirection = TurtleDirection.COLUMN_RIGHT;
	
	
	public void moveForward(int numberOfSteps, SketchBoard turtlePad) {
		
		getTurtlePen().setCurrentStatus(PenStatus.DOWN);
		
		if(getCurrentDirection() == TurtleDirection.COLUMN_RIGHT) {
			
			int tempCol = getCurrentCol();
			turtlePad.getBoardFloor()[getCurrentRow()][tempCol] = 1;
			
			for(int i = 1; i < numberOfSteps; i++) {
				
				tempCol++;
				turtlePad.getBoardFloor()[getCurrentRow()][tempCol] = 1;
				
			}
			setCurrentCol(tempCol);
			System.out.println(getCurrentCol());
		}
		
		
		
	}
	
	public void turnRight() {
		
		if(getCurrentDirection() == TurtleDirection.COLUMN_RIGHT) {
			
			setCurrentDirection(TurtleDirection.ROW_DOWN);
		}
		
		else if(getCurrentDirection() == TurtleDirection.ROW_DOWN) {
			setCurrentDirection(TurtleDirection.COLUMN_LEFT);
		}
		else if(getCurrentDirection() == TurtleDirection.COLUMN_LEFT) {
			setCurrentDirection(TurtleDirection.ROW_UP);
		}
		else if(getCurrentDirection() == TurtleDirection.ROW_UP) {
			setCurrentDirection(TurtleDirection.COLUMN_RIGHT);
		}
		
	}
	
	public void turnLeft() {
		
		if(getCurrentDirection() == TurtleDirection.COLUMN_RIGHT) {
			
			setCurrentDirection(TurtleDirection.ROW_UP);
		}
		else if(getCurrentDirection() == TurtleDirection.ROW_UP) {
			setCurrentDirection(TurtleDirection.COLUMN_LEFT);
		}
		else if(getCurrentDirection() == TurtleDirection.COLUMN_LEFT) {
			setCurrentDirection(TurtleDirection.ROW_DOWN);
		}
		else if(getCurrentDirection() == TurtleDirection.ROW_DOWN) {
			setCurrentDirection(TurtleDirection.COLUMN_RIGHT);
		}
	}
	
	public TurtleDirection getCurrentDirection() {
		return currentDirection;
	}
	public void setCurrentDirection(TurtleDirection currentDirection) {
		this.currentDirection = currentDirection;
	}
	
	public DrawingPen getTurtlePen() {
		return turtlePen;
	}
	
	public void setTurtlePen(DrawingPen turtlePen) {
		this.turtlePen = turtlePen;
	}
	
	public int getCurrentRow() {
		return currentRow;
	}
	
	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}
	
	public int getCurrentCol() {
		return currentCol;
	}
	
	public void setCurrentCol(int currentCol) {
		this.currentCol = currentCol;
	}
	
	
	
}

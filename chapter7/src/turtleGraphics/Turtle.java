package turtleGraphics;

public class Turtle {

	
	//Represent turtles current position
	private int currentRow;
	private int currentCol;
	
	
	
	
	Pen turtlePen;
	
	

	private TurtleOrientation currentOrientation = TurtleOrientation.COLUMN_RIGHT;
	
	public Pen getTurtlePen() {
		return turtlePen;
	}

	public void setTurtlePen(Pen turtlePen) {
		this.turtlePen = turtlePen;
	}

	
	public void moveFoward(int numberOfSteps, SketchPad drawingPad) {
		
		if(drawingPad == null || numberOfSteps <= 0 || numberOfSteps > drawingPad.accessSketchPad().length) {
			throw new IllegalArgumentException("Drawing pad is required and number of steps should be within bounds of the floor");
		}
		
		
		//set pen position to down
		this.getTurtlePen().setCurrentPosition(PenPosition.DOWN);
		
		if(this.getCurrentOrientation() == TurtleOrientation.COLUMN_RIGHT) {
			
			int tempCurrentColumn = this.getCurrentCol();
			drawingPad.accessSketchPad()[this.getCurrentRow()][this.currentCol] = 1;
			
		
			for(int i = 1; i < numberOfSteps; i++) {
				tempCurrentColumn += 1;
				drawingPad.accessSketchPad()[this.getCurrentRow()][tempCurrentColumn] = 1;
			}
			this.setCurrentCol(tempCurrentColumn);
		}
		else if (this.getCurrentOrientation() == TurtleOrientation.ROW_DOWN){
			
			int tempCurrentRow = this.getCurrentRow();
			drawingPad.accessSketchPad()[tempCurrentRow][this.getCurrentCol()] = 1;
			
			
			for(int i = 1; i < numberOfSteps; i++) {
				tempCurrentRow += 1;
				drawingPad.accessSketchPad()[tempCurrentRow][this.getCurrentCol()] = 1;
			}
			this.setCurrentRow(tempCurrentRow);
			
		} 
		else if(this.getCurrentOrientation() == TurtleOrientation.COLUMN_LEFT) {
			
			int tempCurrentColumn = this.getCurrentCol();
			drawingPad.accessSketchPad()[this.getCurrentRow()][this.currentCol] = 1;
			
		
			for(int i = 1; i < numberOfSteps; i++) {
				tempCurrentColumn -= 1;
				drawingPad.accessSketchPad()[this.getCurrentRow()][tempCurrentColumn] = 1;
			}
			this.setCurrentCol(tempCurrentColumn);
		}
		else if (this.getCurrentOrientation() == TurtleOrientation.ROW_UP){
			
			int tempCurrentRow = this.getCurrentRow();
			drawingPad.accessSketchPad()[tempCurrentRow][this.getCurrentCol()] = 1;
			
			
			for(int i = 1; i < numberOfSteps; i++) {
				tempCurrentRow -= 1;
				drawingPad.accessSketchPad()[tempCurrentRow][this.getCurrentCol()] = 1;
			}
			this.setCurrentRow(tempCurrentRow);
			
		} 
		
		
		
		
		
	}
	
	public void setCurrentOrientation(TurtleOrientation newOrientation) {
		
		this.currentOrientation = newOrientation;
	}
	
	public TurtleOrientation getCurrentOrientation() {
		
		return this.currentOrientation;
	}
	
	public void turnRight() {
		
		if(getCurrentOrientation() == TurtleOrientation.COLUMN_RIGHT) {
			this.setCurrentOrientation(TurtleOrientation.ROW_DOWN);
		}
		
		else if(getCurrentOrientation() == TurtleOrientation.ROW_DOWN) {
			this.setCurrentOrientation(TurtleOrientation.COLUMN_LEFT);
		}
		else if(getCurrentOrientation() == TurtleOrientation.COLUMN_LEFT) {
			this.setCurrentOrientation(TurtleOrientation.ROW_UP);
		}
		
		else if(getCurrentOrientation() == TurtleOrientation.ROW_UP) {
			this.setCurrentOrientation(TurtleOrientation.COLUMN_RIGHT);
		}
		
		
		
	}
	
	public void turnLeft() {
		
		if(getCurrentOrientation() == TurtleOrientation.COLUMN_RIGHT) {
			
		}
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

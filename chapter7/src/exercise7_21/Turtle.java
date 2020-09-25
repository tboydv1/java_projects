package exercise7_21;

/**
 * @author tboydev
 *
 */
public class Turtle {

	private static int[][] floor = new int[20][20];
	private static int row = 0, col = 0, direction = 1;
	
	private enum Pen{UP, DOWN};
	static Pen Status;
	/**
	 * 
	 */
//	public void getCommands(int user) {
//		int[] command = {1,2,3,4,5,6,9};
//		
//		
//	}
	//set pen up
	public void penUP() {
		 Status = Pen.UP;
		 System.out.println("PEN UP");
	}
	//set pen down
	public void penDOWN() {
		Status = Pen.DOWN;
		System.out.println("PEN DOWN");
	}
	//reassign all elements value to zero
	public void clearPad() {
		
		for(int allRows = 0; allRows < floor.length; allRows++) {
			
			for(int allCol = 0; allCol < floor[allRows].length; allCol++) {
				 
				floor[allRows][allCol] = 0;
			}
		}
//		displayArray();
		
	}
	//set row and column to 0
	public void resetPosition() {
		row = 0;
		col = 0;
		
	}
		
	//display current row and column of turtle on array
	public void displayTurtle() {
		System.out.printf("Turtle position is: (%d, %d)", row,col);
	}
	//display a shape where element is set to 1
	public void displayArray(char sign) {
		
		for(int allRows = 0; allRows < floor.length; allRows++) {
			
			for(int allCol = 0; allCol < floor[allRows].length; allCol++) {
				
			
				if(floor[allRows][allCol] == 1) {
					System.out.print(sign);
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
	//change directions value 
	public void turnRight() {
		
		
		direction++;
		if (direction > 4) {
			direction = 1;
		}
		turtleFace();
		
	}
	
	public void turnLeft() {
		
		
		if(direction == 1) {
			direction = 4;
		}
		else 
			direction--;
		turtleFace();
	}
	//display current position value 
	public void turtleFace() {
		if(direction == 1) {
			System.out.println("Turtle is facing North");
		}
		else if(direction == 2)
			System.out.println("Turtle is facing East");
		else if(direction == 3)
			System.out.println("Turtle is facing South");
		else if(direction == 4)
			System.out.println("Turtle is facing West");

	}
	
	//move forward in set direction
	public void moveForward(int no_of_spaces) {
		
		switch(direction) {
		
		case 1: 
			try {
			for(int count = 0; count < no_of_spaces; count++) {
				
				if(Status == Pen.DOWN)  
				floor[row][col] = 1;
				
				if(Status == Pen.UP)
					floor[row][col] = 0;
				
				row--;
			}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Border exceeded");
				row = 0;
			}
			
			break;
		case 2:
			try {
			for(int count = 0; count < no_of_spaces; count++) {
				
				if(Status == Pen.DOWN) 
				floor[row][col] = 1;
				
				if(Status == Pen.UP)
					floor[row][col] = 0;
				
				col++;
			}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Border exceeded");
				col = 0;
			}
			break;
		case 3: 
			try {
			for(int count = 0; count < no_of_spaces; count++) {
				if(Status == Pen.DOWN)
				floor[row][col] = 1;
				
				if(Status == Pen.UP)
					floor[row][col] = 0;
				row++;
			}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Border exceeded");
				row = 0;
			}
			break;
		case 4: 
			try {
			
			for(int count = 0; count < no_of_spaces; count++) {
				
				if(Status == Pen.DOWN)
				floor[row][col] = 1;
				
				if(Status == Pen.UP)
					floor[row][col] = 0;
				
				col--;
			}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Border exceeded");
				col = 0;
			}
				
			
		}
	}
}

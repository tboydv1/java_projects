package exercise7_21;
import java.util.Scanner;

public class TurtleGraphics {

	
	
	public static void moveTurtle() {
		Scanner input = new Scanner(System.in);
		Turtle prams = new Turtle();
		
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n","Turtle Grapics SketchPad", "Commands", "(1) Pen up", "(2) Pen down",
				"(3) Turn right", "(4) Turn Left","(5) Move Forward", "(6) Display array",
				"(7) Clear pad","(8) Reset Turtle Position", "(9) End of data");
		int control = input.nextInt();
		
		while(control != 9) {
		
		
		switch(control) {
		case 1: 
			prams.penUP();
			break;
			
		case 2: 
			prams.penDOWN();
			break; 
			
		case 3: 
			prams.turnRight();
			break;
			
		case 4:
			prams.turnLeft();
			break;
			
		case 5:
			System.out.println("Enter number of spaces: ");
			int spaces = input.nextInt();
			prams.moveForward(spaces);
			break;
		case 6:
			System.out.println("Enter character: ");
			char sign = input.next().charAt(0);
			prams.displayArray(sign);
			break;
		case 7: 
			prams.clearPad();
			break;
		case 8: 
			prams.resetPosition();
			break;
			
		}
		prams.displayTurtle();
		System.out.println();
		control = input.nextInt();
		
		}
		input.close();
	}
	
	public static void main(String[] args) {
		moveTurtle();
	}
}

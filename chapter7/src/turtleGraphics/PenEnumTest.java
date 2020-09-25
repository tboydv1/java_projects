package turtleGraphics;

public class PenEnumTest {

	
	static PenPosition left = PenPosition.UP;
	static PenPosition right = PenPosition.DOWN;
	
	public static void main(String args[]) {
		
		
		
		for(PenPosition position: PenPosition.values()) {
			
			System.out.print(position + "\n");
			
			System.out.println(position.getValue() + "\n");
			
			if(position == PenPosition.UP) {
				System.out.print(position.getValue() + "Value\n");
			}
		}
		
		int value = right.getValue();
		SketchPad floor = new SketchPad();
		
		for(int i = 0; i < floor.accessSketchPad().length; i++) {
			
			for(int j = 0; j < floor.accessSketchPad()[i].length; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}

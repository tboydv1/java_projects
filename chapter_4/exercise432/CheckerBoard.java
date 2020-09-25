package chapter4.exercise432;

public class CheckerBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter = 1;
		  
		while (counter <= 4)
		{
			int row = 1;
			
			while(row <= 8)
			{
				System.out.print("* ");
				row++;
			}
			System.out.println();		
			
			System.out.print(" ");
		
			
				int column = 1;
				while(column <= 8)
				{
					System.out.print("* ");
					column++;
				}	
				System.out.println();
			counter++;
		}
	}

}

package chapter4.exercise419;
import java.util.Scanner;

public class SalesCommission {
	private double totalItemsValue = 0;
	private double salesEarnings;
	
	
	
	public void recordItemsSold()
	{
		 int itemCounter = 1;
		 int itemNo;
		 double total = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input 1 - 4 for item type sold and 0 to terminate: ");
		int type = input.nextInt();
		
		while(type != 0)
		{
			System.out.println("How many was sold: ");
			 itemNo = input.nextInt();
			 if(type == 1) 
				 total = (double) itemNo * 239.99;
			 else if(type == 2)
				 total = (double) itemNo * 129.75;
			 else if(type == 3)
				 total = (double) itemNo * 99.95;
			 else if(type == 4)
				 total = (double) itemNo * 350.89;
			 else {
				 System.out.println("Invalid item, input items 1 - 4");
			  continue;
			  }
			
			 totalItemsValue += total;
			 itemCounter++;
			 
			 System.out.println("Enter next item or 0 to terminate: ");
			 type = input.nextInt(); 
		}
		
		input.close();
	}
	public double calculateEarnings()
	{
		salesEarnings = totalItemsValue * 0.09 + 200;
		return salesEarnings;
	}
	
}

package exercise5_17;

import java.util.Scanner;

public class Sales {

	private int productNumber;
	private int quantitySold;
	
	private double product1 = 2.97;
	private double product2 = 4.50;
	private double product3 = 9.98;
	private double product4 = 4.49;
	private double product5 = 6.87;
	
	public int getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}
	public int getQuantitySold() {
		return quantitySold;
	}
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}
	
	public void calculateRetailAmount()
	{
		Scanner input = new Scanner(System.in);
		
		 double totalSales = 0, item1 = 0, item2 = 0, item3 = 0, item4 = 0, item5 = 0;
		 
		 System.out.printf("%s%n%s%n%n", "Enter product number and quantity sold for all items sold,",
		 		"Enter (-1) to terminate input,");
		 
		 System.out.println("Enter product number or -1 to termiate input");
		 productNumber = input.nextInt();
		 
		 while(productNumber != -1)
		 {
			 if(productNumber == 1 || productNumber == 2 || productNumber == 3 || productNumber == 4 || productNumber ==5 )
			 {
			 System.out.println("Enter quantity sold: ");
			 quantitySold = input.nextInt();
			 }
			 else System.out.println("invalid product number!");
			 
			
			 switch(productNumber)
			 {
			 case 1: 
				 item1 += product1 * quantitySold ;
				 System.out.printf("product 1: %.2f%n", product1);
				 break;
				 
			 case 2:
				 item2 = product2 * quantitySold + item2;
				 System.out.printf("product 2: %.2f%n", product2);
				 break;
				 
			 case 3:
				 item3 = product3 * quantitySold + item3;
				 System.out.printf("product 3: %.2f%n",  product3);
				 break;
				 
			 case 4:
				 item4 = product4 * quantitySold + item4;
				 System.out.printf("product 4: %.2f%n",  product4);
				 break;
				 
			 case 5: 
				 item5 = product5 * quantitySold + item5;
				 System.out.printf("product 5: %.2f%n", product5);
				 
			 }
			 totalSales = item1 + item2 + item3 + item4 + item5;
			 System.out.printf("current total: %.2f%n", totalSales);
			 
			 System.out.println("Enter product number or -1 to terminate input: ");
			 productNumber = input.nextInt();
			 
			
		 }
		 totalSales = item1 + item2 + item3 + item4 + item5;
		 System.out.printf("Total retail value is: %.2f", totalSales);
		 input.close();
		
	}
	public static void main(String[] args)
	{
		Sales jcPenny = new Sales();
		
		
		jcPenny.calculateRetailAmount();
		
	}
}

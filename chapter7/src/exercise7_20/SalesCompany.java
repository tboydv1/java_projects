package exercise7_20;

import java.util.Random;

public class SalesCompany {

	private double[][] sales = new double[4][5];
	

	public void processSlip() {
		Random gross = new Random();
		//process slips for each saleperson daily sales 
		
		double dailySale = 1;
			
			for(int id = 0; id < sales.length; id++) {
			
				for(int product = 0; product < sales[id].length; product++ ) {
					dailySale = gross.nextInt(1000);
					sales[id][product] += dailySale;
				}
				dailySale = 10;
			}
			
		

	}
	
	public void slipByPerson() {
		
		processSlip();
		double total = 0;
		
		System.out.print("Sales persons");
		printNumber();
		System.out.printf("%15s","Totals");
		System.out.println("\n");
		for(int product = 0; product < 5; product++) {
			System.out.printf("Prod %d ", product + 1);
		for(int salePersons = 0; salePersons < sales.length; salePersons++) {
			
			System.out.printf("%15.2f",sales[salePersons][product]);
			total += sales[salePersons][product];
		}
		System.out.printf("%14.2f", total);
		total = 0;
			System.out.println('\n');
			
	}
		
		int sp = 0;
		double totalbyProduct = 0;
		
		System.out.printf("%s%n%8s","Product","Totals: ");
		for(int count = 0; count < sales[0].length; count++) {
			
			totalbyProduct = sales[sp][count] + totalbyProduct;
			if(count == 4 ) {
				
				System.out.printf("%15.2f", totalbyProduct);
				totalbyProduct = 0;
				sp++;
				count = 0;
			}
			if(sp > 3) {
				break;
			}
			
		}
}
	public void printNumber(){
		
		for( int count = 0; count < sales.length; count++) {
			if(count == 0)
			System.out.printf("%7d", count + 1);
			else
				System.out.printf("%15d", count + 1);
				
				
		}
		
	}
	
}

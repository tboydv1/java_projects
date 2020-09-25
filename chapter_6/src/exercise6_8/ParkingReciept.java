package exercise6_8;

import java.util.Scanner;

public class ParkingReciept {

	public static double calculateCharges(int hours) {
		
		double charges  = 0.0;
		
		if((hours >= 1)&&(hours <=3)){
			charges = 2.0;
		}
		else if((hours >3)&&(hours < 19)) {
			charges = ((hours - 3) * 0.5)+ 2.0;
		}
		else if(hours > 19) {
			charges = 10.0;
		}
		
		return charges;
	}
	
	public static double calculateReceipts() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter total number of receipts");
		int count = input.nextInt();
		int hours;
		double receiptTotal = 0;
		
		for(int d = 1; d <= count; d++) {
			System.out.println("Enter hours parked");
			hours = input.nextInt();
			
			System.out.printf("Customer charge is: %.2f%n",calculateCharges(hours));
			receiptTotal += calculateCharges(hours);
		}
		return receiptTotal;	
	}
	
	public static void main(String [] args) {
		System.out.printf("%nRunning total of yesterday's reciepts is: %.2f", calculateReceipts());
	}
}

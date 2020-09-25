/**
 * 
 */
package chapter4.exercise317;
import java.util.Scanner;
/**
 * @author user
 *
 */
public class GasMileage {

	private double milesDriven;
	private double gallonsUsed;
	private int totalMilesPerGallons = 0;
	int tripCounter = 0;
	
	public double calculateMilesPerGallons()
	{
		double milesPerGallons;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 to record miles driven and gallons used for each trips and  to end ");
		int trips = input.nextInt();
		
		int newTrips = 1;
		
		while(trips != 0)		
		{
			
			System.out.print("Enter miles driven: ");
			milesDriven = input.nextDouble();
			
			System.out.print("Enter gallons Used: " );
			gallonsUsed = input.nextDouble();
			
			milesPerGallons = milesDriven / gallonsUsed;
			System.out.printf("Mile per gallons for trip %d is: %.2f%n%n", newTrips,  milesPerGallons);
			
			totalMilesPerGallons += milesPerGallons;
			newTrips++;
			
			System.out.print("Enter 1 to continue and 0 to end: ");
			trips = input.nextInt();
		}
		input.close();
//		this.tripCounter = newTrips;
		return totalMilesPerGallons;
	}
//	public double averageTrips()
//	{
//		double average = totalMilesPerGallons / tripCounter;
//		return average;
//	}
	
	
//	public int getTripCounter()
//	{
//		return tripCounter;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GasMileage Driver1 = new GasMileage();
		
		System.out.printf("%nTotal miles per gallons for all trips is %.2f%n", Driver1.calculateMilesPerGallons());
	}

}

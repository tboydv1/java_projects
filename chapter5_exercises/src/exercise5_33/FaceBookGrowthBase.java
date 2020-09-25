package exercise5_33;

public class FaceBookGrowthBase {

	private double no_of_users = 1_000_000_000;
	private double growth_rate = 1 + 0.04;
	
	public void calculateGrowthRate() {
		double estimate = 0;
		double month;
		
		for(month = 1; month > 0; month++) {
			
			estimate = no_of_users * Math.pow(growth_rate, month);
			
			if(estimate >= 1_500_000_000) {
				System.out.printf("Facebook user base would be %,.2f in %f months.%n", estimate, month);
				
			}
			if(estimate >= 2_000_000_000) {
				System.out.printf("Facebook user base would be %,.2f in %f months.", estimate, month);
				break;
			}
		}
		
	}
}

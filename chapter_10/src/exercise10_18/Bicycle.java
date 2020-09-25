package exercise10_18;

public class Bicycle implements CarbonFootPrint {

	private double totalMiles;

	public double getTotalMiles() {
		return totalMiles;
	}

	public void setTotalMiles(double totalMiles) {
		
		if(totalMiles < 0.0)
			throw new IllegalArgumentException();
		
		this.totalMiles = totalMiles;
	}
	
	public double getCarbonFootPrint() {
		
		return getTotalMiles() * 34;
	}
	
	public String toString() {
		
		return String.format("Bicycle's CarbonFootPrint Formula is: %n(TotalMiles * 34)%n");
	}
}

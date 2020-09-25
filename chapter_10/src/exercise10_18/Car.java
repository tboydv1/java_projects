package exercise10_18;

public class Car implements CarbonFootPrint {

	private double averageYearlyMiles, averageMPG;

	public double getAverageYearlyMiles() {
		return averageYearlyMiles;
	}

	public void setAverageYearlyMiles(double averageYearlyMiles) {
		
		if(averageYearlyMiles < 0.0)
			throw new IllegalArgumentException();
		
		this.averageYearlyMiles = averageYearlyMiles;
	}

	public double getAverageMPG() {
		return averageMPG;
	}

	public void setAverageMPG(double averageMPG) {
		
		if(averageMPG < 0.0)
			throw new IllegalArgumentException();
		
		this.averageMPG = averageMPG;
	}
	
	public double getCarbonFootPrint() {
		
		double gallon = getAverageYearlyMiles() / getAverageMPG();
		
		double result = ((getAverageYearlyMiles() * getAverageMPG()) * 9 / gallon);
		
		if(result < 0.0 || Double.isNaN(result)) {
			
			result = 0.0;
		}
		
		return result;
	}
	
	public String toString() {
		
		return String.format("Car's CarbonFootPrint Formula is: %n((AverageYearlyMiles) * AverageMpg)"
				+ "9kg / gallons%n");
	}
}

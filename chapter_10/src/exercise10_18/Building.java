package exercise10_18;

public class Building implements CarbonFootPrint {

	private double  monthlyElectricityKWH;

	
	
	public double getMonthlyElectricityKWH() {
		return monthlyElectricityKWH;
	}



	public void setMonthlyElectricityKWH(double monthlyElectricityKWH) {
		
		if(monthlyElectricityKWH < 0.0)
			throw new IllegalArgumentException();
		
		this.monthlyElectricityKWH = monthlyElectricityKWH;
	}



	public double getCarbonFootPrint() {
		
		return getMonthlyElectricityKWH()  * 12;
	}
	
	public String toString() {
		
		return String.format("Buildings CarbonFootPrint Formula is: %n(MonthlyElectricityKwh) * 12%n");
	}
}

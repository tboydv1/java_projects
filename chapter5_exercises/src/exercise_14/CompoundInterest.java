package exercise_14;

public class CompoundInterest {

	public void calculateYealyInterest()
	{
		double rate = 1 + 0.05;
		double principal = 1000.00;
		double deposit;
		
		
		for (int i = 1; i <= 6; i++)
		{
			System.out.printf("%s%.2f%n%s%20s%n", "Interest rate: ",rate, "Year", "Amount on deposit");
			double pow = 1;
			for(int n = 1; n <= 10; n++) //n represents number of years
			{
				pow = pow * (rate);
				
			deposit = principal * pow;
			
			System.out.printf("%4d%,20.2f%n", n, deposit);
			}
			System.out.println();
			rate += 0.01;
		}
		
		
	}
	public static void main(String[] args)
	{
		CompoundInterest pension = new CompoundInterest();
		
		pension.calculateYealyInterest();
		}

}

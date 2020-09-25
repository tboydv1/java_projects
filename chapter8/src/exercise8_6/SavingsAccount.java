package exercise8_6;

public class SavingsAccount {

	
	private static double annualInterestRate;
	
	private double savingBalance;
	
	public SavingsAccount(double savings) {
		
		this.savingBalance = savings;
		
	}


	public static void modifyInterestRate(double rate) {
		
		SavingsAccount.annualInterestRate = rate;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	public double calculateMonthlyInterest() {
		
		double monthlyinterest = (savingBalance * annualInterestRate) / 12;
		
		return monthlyinterest + savingBalance;
	}
	
	
	
}

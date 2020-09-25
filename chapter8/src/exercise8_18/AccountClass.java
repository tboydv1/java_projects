package exercise8_18;

public class AccountClass {

	
	//This program represents a bank account
	//method set name of account and returns name value
	//Author: Oluwatobi, Date : 11th may 2019

	// Class account declaration 
		

	//instance variable
		private String name;
		private double balance;
		private double withdrawAmount;

		public AccountClass()
		{} //default 
	//constructor initailezes name with paramether name 
		public AccountClass(String name, double balance){

			this.name = name;

			if (balance > 0.0)

			this.balance = balance;
		}

	//method for setting name value 

		public void setName(String name){

			this.name = name;  // store the name 
		}

	//method for getting name value

		public String getName() {

			return name;  // return value of name to caller

		}
	//method for setting Balance
		public void setBalance(double deposit){

			if(deposit > 0.0) //checks if value id valid

			this.balance = balance + deposit;	
			
		} 
	//method for getting balance value
		public double getBalance() {

			return balance;  // return value of name to caller
		} 
	//method to set withdraw balance 
		public void withdraw(double withdrawAmount)
		{
			if (withdrawAmount < balance)	//check if withdraw amount is not greater than balance
	 		{
				this.withdrawAmount = withdrawAmount;
				this.balance = balance - withdrawAmount;
				System.out.println("withdraw Successfull!!");
				System.out.printf("%s new balance is: %.2f",name, balance);
			}
			else 
				System.out.println("Withdrawal amount exceeded account balance");	
		} 

		
	}//End of class Account. 




package exercise5_30;

import java.util.Scanner;

public class AutoPolicyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		AutoPolicy client = new AutoPolicy(1234, "Toyota Camry", "NE");
		
		policyInNoFaultState(client);

		
		
	
	}
	public static void policyInNoFaultState(AutoPolicy object) 
	{
		System.out.printf("Account #: %d; Car: %s;%nState %s %s a no -fault state%n", object.getAccountNumber(),
				object.getMakeAndModel(),
				object.getState(), object.isNoFaultState() ? "is" : "is not");
	}
	
}

//The auto policy:
//Account #: 11111111; Car: Toyota Camry;
//State NJ is a no-fault state
//The auto policy:
//Account #: 22222222; Car: Ford Fusion;
//State ME is not a no-fault state
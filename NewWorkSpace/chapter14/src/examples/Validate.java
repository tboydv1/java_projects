package examples;

import java.util.Scanner;

public class Validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter first name:");
		String firstName = input.nextLine();
		
		System.out.println("Please enter last name:");
		String lastName = input.nextLine();
		
//		System.out.println("Please enter address:");
//		String address = input.nextLine();
//		
//		System.out.println("Please enter city:");
//		String city = input.nextLine();
//		
//		System.out.println("Please enter state:");
//		String state = input.nextLine();
//		
//		System.out.println("Please enter zip:");
//		String zip = input.nextLine();
//		
//		System.out.println("Please enter phone:");
//		String phone = input.nextLine();
		
		System.out.printf("%nValidate Result:");
		
		if(!ValidateInput.validateFirstName(firstName))
			System.out.println("Invalid first name");
		else if(!ValidateInput.validateLastName(lastName))
			System.out.println("Invalid last name");
//		else if(!ValidateInput.validateAddress(address))
//			System.out.println("Invalid address");
//		else if(!ValidateInput.validateCity(city))
//			System.out.println("Invalid City");
//		else if(!ValidateInput.validateAddress(state))
//			System.out.println("Invalid state");
//		else if(!ValidateInput.validateAddress(zip))
//			System.out.println("Invalid zip code");
//		else if(!ValidateInput.validateAddress(phone))
//			System.out.println("Invalid phone");
		else
			System.out.println("Valid input.  Thank you.");
		
	}

}

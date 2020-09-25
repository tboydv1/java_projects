package excercise4_37;

import java.util.Scanner;

public class FactorialConstant {
	public double findConstant(int terms) {
		int counter = 1;
		double temp = 1;
		double constant = 1;
		
		while (counter <= terms)
		{
			temp = counter * temp;
			constant =  (1/ temp) + constant;
//			System.out.println("=====" + constant);
			counter++;
		}
		return constant;
	}
	public double findConstantPower(int terms) {
		int counter = 1; 
		double fact = 1;
		double constant = 1;

		int initialTerm = terms; //Store initial value of the number of terms
		double store = 1; // to store result 
		while(counter <= terms)
		{
			fact = counter * fact; //factorial for all terms
			constant =  store / fact + constant; //division by factorial result 
			

		counter++;
			
				store = initialTerm * store;
				constant =  store / fact + constant; //division by factorial result 
				

			counter++;
		}
		return constant;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		FactorialConstant nest = new FactorialConstant();
		
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		System.out.printf("%.2f",nest.findConstant(number));
		input.close();
	}

}

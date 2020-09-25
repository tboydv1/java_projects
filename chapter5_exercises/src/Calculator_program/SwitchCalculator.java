package Calculator_program;

import java.util.Scanner;

public class SwitchCalculator {

	public void calculateValues(){
		
		double  result = 0;
		double pow = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculator Format ((+-*/%^))(x,y) (# - terminate) 'enter'\nEnter operation: ");
		
		
		char op = input.next().charAt(0);
		
		while(op != '#') {
			double num1 = input.nextDouble();
			double num2 = input.nextDouble();
		
			switch(op)
			{
			case '+':
				result = num1 + num2;
				break;
			
			case '-':
				result = num1 - num2;
				break;
			
			case '*': 
				result = num1 * num2;
				break;
			
			case '/':
				result = num1 / num2;
				break;
				
			case '^':
				for(int i = 1; i <=num2; i++)
					pow = pow * num1;
				result = pow;
				break;
			case '%': 
				result = num1 % num2;
				break;
			}
			System.out.printf("Result is: %.3f%n", result);
			op = input.next().charAt(0);
		
		}
		
	}
	public static void main(String[] args) {
		
		
		
		SwitchCalculator form = new SwitchCalculator();
		
		form.calculateValues();
		

	}

}

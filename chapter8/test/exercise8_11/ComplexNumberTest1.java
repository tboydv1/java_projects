package exercise8_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComplexNumberTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
//		Complex numbers = new Complex();
		
		try {
		System.out.println("Enter complex number values:(real, imaginary)");
		double real = input.nextDouble();
		double imaginary = input.nextDouble();
		
		Complex obj1 = new Complex(real, imaginary);
		
		System.out.println("Enter complex number values:(real, imaginary)");
		double real1 = input.nextDouble();
		double imaginary1 = input.nextDouble();
		

		Complex obj2 = new Complex(real1, imaginary1);
		
		System.out.println(obj1.addComplexNumbers(obj2));
		}
		catch(InputMismatchException e) {
			System.out.println("Error!! double value expected");
			
		}
	}

}

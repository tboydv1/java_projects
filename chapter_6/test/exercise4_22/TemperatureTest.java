package exercise4_22;

import java.util.Scanner;

import exercise6_22.Temperature;

public class TemperatureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.printf("enter f to convert Fahrenheit - Celcusis%nenter  c to convert Celsius - Fahrenheit%n");
		char select = in.next().charAt(0);
		System.out.print("Enter temperature value: ");
		double temp = in.nextDouble();
		Temperature.calculateTemperature(select, temp);
		
		
		
	}

}

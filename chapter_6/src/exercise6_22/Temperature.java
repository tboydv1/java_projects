package exercise6_22;

public class Temperature {

	public static double fahrenheit(double celsius) {
		
		double fahrenheit = ((9.0 / 5.0) * celsius) + 32;
		
		return fahrenheit;
	}
	
	public static double celsius(double fahrenheit) {
		
		double celsius = (5.0 / 9.0) * (fahrenheit - 32);
		
		return celsius;
	}
	
	public static double calculateTemperature(char type, double temp) {
		double result = 0;
		if(type == 'f') {
			System.out.printf("Celsius equivalent is: %.2f~C", celsius(temp));
		}
		else if (type == 'c') {
			System.out.printf("Fahrenheit equivalent is: %.2f~F", fahrenheit(temp));
		}
		
		
		return result;
	}
	
	
}
	
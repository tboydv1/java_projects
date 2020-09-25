package chapter_6examples;

public class Sphere {


public static double sphereVolume(double radius) {
	
	//calculates the volume of sphere with radius
	
	double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	
	//return volume
	return volume;
	}
public static void main(String [] args) {
	
	java.util.Scanner input = new java.util.Scanner(System.in);
	
	System.out.println("Enter radius of sphere: ");
	double rad = input.nextDouble();
	
	System.out.printf("Volume is %f", sphereVolume(rad));
	input.close();
	}
}

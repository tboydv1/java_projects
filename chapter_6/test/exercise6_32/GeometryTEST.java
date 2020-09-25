package exercise6_32;

import java.util.Scanner;

public class GeometryTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter coordinates of the points x1 and y1: ");
			Geometry.x1 =  in.nextDouble();
			
			Geometry.y1 = in.nextDouble();
			
			System.out.println("Enter coordinates of the points x2 and y2: ");
			Geometry.x2 = in.nextDouble();
			
			Geometry.y2 = in.nextDouble();
			
			System.out.printf("Distance between the points is: %f", Geometry.findDistance());
			
			in.close();

		}
	}



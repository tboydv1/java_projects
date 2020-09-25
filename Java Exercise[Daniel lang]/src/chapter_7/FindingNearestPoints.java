package chapter_7;

import java.util.Scanner;

public class FindingNearestPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of points: ");
		int numberOfPoints = input.nextInt();
		
		//create an array to store points
		
		double[][] points = new double[numberOfPoints][2];
		System.out.printf("Enter %d points: ", numberOfPoints);
		
		for(int i = 0; i < points.length; i++) {
			 points[i][0] = input.nextDouble();
			 points[i][1] = input.nextDouble();
		}
		
		int p1 = 0, p2 = 1;
		double shortestDistance = distance(points[p1][0], points[p1][1], 
				points[p2][0], points[p2][1]);
		
		double distance;
		for(int i = 0; i < points.length; i++) {
			for(int j = i + 1; j < points.length; j++) {
				
				distance = distance(points[i][0], points[i][1], 
						points[j][0], points[j][1]);
				
				if(shortestDistance > distance) {
					p1 = i; // update p1
					p2 = j; //update p2
					shortestDistance = distance; //Update shortestDistance
				}
			}
		}
		
		System.out.printf("The closest two points are: (%.1f, %.1f) and (%.1f, %.1f)", points[p1][0],points[p1][1],points[p2][0],points[p2][1]);
		
		
	}
	public static double distance(double x1, double y1, double x2, double y2) {
		
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

}

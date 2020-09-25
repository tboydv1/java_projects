//Program inputs the radius of a circle and calculates it Diameter, circumference and and area
//oluwatobi 
import java.util.Scanner;
    public class CircleMath
    {
        public static void main(String[] args)
        {
        Scanner input = new Scanner(System.in);    
            //instance variables 
            int radius;
        System.out.println("Enter circle radius: ");
        radius = input.nextInt();
        
        //Process Phase
        System.out.printf("The Diameter of circle of radius %d is : %d%n%n", radius, 2 * radius );
        System.out.printf("The Circumference of the circle is: %f%n%n", 2 * 3.1459 * radius);
        System.out.printf("The Area of circle  of radius %d is : %f%n", radius, 3.1459 * (radius * radius));

        // System.out.printf("The characters %c %c %c has a UNICODE value of %d %d %d%n", 'A', 'B', 'C', (int) 'A', (int) 'B', (int) 'C');
        // System.out.printf("The characters %c %c %c has a value of %d %d %d", '1', '0', '3', (int) '1', (int) '0', (int) '3');
        }
    }
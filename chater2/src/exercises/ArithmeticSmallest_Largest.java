/*This program reads three input from user and calculates thier (sum), (average), (product) and then displays the smallest and largest numbers.*/
//Author. Oluwatobi. 10th may 2019
package exercises;
import java.util.Scanner;

//class declaration
	public class ArithmeticSmallest_Largest {


//main method begins 
	public static void main (String[] args) {

//instance variables declaration
	 int num1;
	 int num2;
	 int num3;
	 int sum;
	int average;
	int product;

//create new scanner
	Scanner input = new Scanner(System.in);

System.out.println("Enter first digit: "); //prompt user for input
	num1 = input.nextInt(); //store first number 

System.out.println("Enter Second digit: "); //prompt user for input
	num2 = input.nextInt(); //store second number 

System.out.println("Enter third digit: "); //prompt user for input
	num3 = input.nextInt(); //store third number

//calculate sum of digits
	sum = num1 + num2 + num3;
System.out.printf("%s%d%n ", "The sum is ", sum); //display sum

//calcualte average of digits 
	average = sum / 3;
System.out.printf("%s%d%n ", "The average is ", average); //display average

//calculate product of digits
	product = num1 * num2 * num3;
System.out.printf("%s%d%n ", "The product is ", product); //display product 

if (num1 > num2)
	System.out.println("the largest number is " + num1);

	}//end of method main
}//end of class declaration
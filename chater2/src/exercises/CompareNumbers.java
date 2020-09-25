//program for comparing integers
//Author: Oluwatobi, Date: May 10, 2019

//import scanner class
package exercises;
import java.util.Scanner;

// class Declaration 
public class CompareNumbers {

//main method declaration 
public static void main (String[] args) {

//Variable declarations 
	 int num1;
	 int num2;
	 int large;
	 int equal;

//create scanner input
Scanner input = new Scanner (System.in);

 System.out.println("Enter first integer: ");	//prompt user for first integer 

//store interger in variable num1
	num1 = input.nextInt();

System.out.println("Enter Second integer: "); //prompt user for second interger 

//store integer value in variable num2
	num2 = input.nextInt();

//display value of num1 if larger 
if (num1 > num2) 
System.out.println(num1 + " is larger");

//displays value of num2 if larger 
if (num2 > num1)
System.out.println(num2 + " is larger");

//display string if equal
if (num1 == num2) 
System.out.println("These number are equal");


	}//End of method main
}//End of class Declaration 
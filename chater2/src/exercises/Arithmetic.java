//This program would recieve input from the user and print their sum, quotient (division), difference and product. 
//Program Class "Arithmetic
//Author: Oluwatobi . Date May.10.2019
package exercises;
 import java.util.Scanner; 	//import Scanner class

//Class Declaration 

	public class Arithmetic {

//main method declaration
 public static void main (String[] args) {

//Instance Variable Declaration
	int num1;		//recieves first input from user
	int num2;		//recieves second input from user
	int sum;		//calculates the sum of user input
	int product;	//calculates the product
	int diff;		//calculates the difference 
	int quotient;	//calculates division

//create new scanner user  
Scanner user = new Scanner (System.in);

System.out.println("Enter first number: "); //prompt user for input 

	num1 = user.nextInt();	//recieves input from user and stores in num1

System.out.println("Enter second number: "); //prompt user for second input 

	num2 = user.nextInt();	//reciever input from user and stores in num2

//calculate sum 
	sum = num1 + num2;	
//calculate product 
	product = num1 * num2;
//calculate diff
	diff = num1 - num2;
//calculate  Quotient
	quotient = num1 /num2;

//Display result of sum
System.out.printf("The sum is %s%n", sum);

//Display result of product 
System.out.printf("The product is %s%n", product);

//Display result of diff
System.out.printf("The difference is %s%n", diff);

//Display result of Quotient 
System.out.printf("The Quotient is %s%n", quotient);

}	//End of main method
}	//End of class declaration
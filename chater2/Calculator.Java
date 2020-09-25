//program that takes user input and calculates Addition, Subtraction, Multiplicaation and Division
//Author:Omotosho Oluwatobi
//Date: 30th April; 1:23pm

//Import Scanner from Library 

Import java.util.Scanner

//Declare Java Class Name
public class Calculator {

    //main method Declaration 
    public static void main(String[] args) {
        //Declare Scanner variable 
        Scanner input = new Scanner(System.in);
    // Declare input variable and Promt user argument 
   System.out.print("Enter first number ");//Promt user for input
    int FigOne = input.nextInt();

    System.out.print("Enter Second number ");//Prompt user for input 
    int FigTwo = input.nextInt();//User inputs Second Number 

   //Perform addition with User input.(first and second number) store total in Addition
    int Addition = FigOne + FigTwo;

    //Perform Subtraction with user input() and store total in Subtraction 
    int Subtraction = FigOne  - FigTwo;
    
    //Perfrom Division with user input() store total in Division 
    int Division = FigOne / FigTwo;

    //Perform Multiplication with user input() Store total in Multiplication 
    int Multiplication = FigOne * FigTwo;

    //Display Value"Addition"
    System.out.printf("Sum is %d%n" Addition);
    //Display Value "Subtraction"
    System.out.printf("Subtraction is %d%n" Subtraction);
    //Display value"Division"
    System.out.printf("Division is %d%n" Division);
    //Display Value "Multiplication"
    System.out.printf("Multiplication is %d%n" Multiplication);



    
   

    }
}
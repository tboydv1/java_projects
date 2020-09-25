//Fig 2.7 StringInt.java
//Program that displays name and age
/*Author:Oluwatobi
Date:30th April 10:39am
*/

import java.util.Scanner;//program uses class scanner

public class StringInt {
    //main method begins execution of java application 

    public static void main(String[] args) {
        //create a scanner to obtain input from the console window

        Scanner input = new Scanner(System.in);

    System.out.print("Enter Name "); //prompt
        String name1 = input.nextLine(); //read first number from user 

        System.out.print("Enter age: "); //prompt

        int num2 = input.nextInt(); //read second number from user 

        input.close();


    

        System.out.println("Your name is " + name1 + " You are "+ num2 + " years old");

    }//end method main
}//end clas Subtration
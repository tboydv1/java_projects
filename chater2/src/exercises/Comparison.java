//Fig. 2.15: Comparison.java
package exercises;
//Compare integers using if statements, relational operators
//and equality operators.
/*Author:Oluwatobi
Date:30th April 10:39am
*/
import java.util.Scanner;
//Class Declaration 
public class Comparison {
    //main method begins execution of java application 
    public static void main(String[] args) {
        //create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);

        System.out.print("Enter frist integer: "); //prompt
        int FirstNum = input.nextInt();//read first input from user 

        System.out.print("Enter Second integer: ");//prompt
        int SecondNum = input.nextInt();//read second input from user
        
        if (FirstNum == SecondNum)
            System.out.printf("%d == %d%n", FirstNum, SecondNum);
        
        if(FirstNum != SecondNum) {
            System.out.printf("%d != %d%n", FirstNum, SecondNum);
        }
        if(FirstNum < SecondNum){
            System.out.printf("%d < %d%n", FirstNum, SecondNum);
        }
        if (FirstNum > SecondNum) {
            System.out.printf("%d > %d%n", FirstNum, SecondNum);
        }
        if (FirstNum <= SecondNum){
            System.out.printf("%d <= %d%n",FirstNum , SecondNum);
        }
        if (FirstNum >= SecondNum) {
            System.out.printf("%d >= %d%n", FirstNum, SecondNum);
        }
    }
}

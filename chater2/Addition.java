//Fig 2.7 Adiition.java
//Addition program that input two numbers then displays their sum 
/*Author:Oluwatobi
Date:30th April 10:39am
*/
import java.lang;
import java.util.Scanner; //program uses class Scanner
import javax.swing.JOptionPane;

public class Addition {
    //main method begins execution of java application 
    public static void main(String[] args) {
        //create a Scanner to obtain input from the command window 
//        Scanner input = new Scanner(System.in);
//Promtp using dialog Box
        Integer.parseInt  =
	JOptionPane.showInputDialog("Enter first integer: "); 
//      int number1 = input.nextInt(); //read first number from user

        Integer.parseInt =
	JOptionPane.showInputDialog("Enter Second integer: "); //prompt 
//      int number2 = input.nextInt(); //read second number from user 

        Integer.parseInt sum = number1 + number2; //add numbers, then store total in sum

       JOptionPane.showMessageDialog(null, "Sum is ", sum); //display sum
         
//        input.close();
    }//end method main
}//end class addition 
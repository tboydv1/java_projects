//multiples program check if first number is multiples of the second
//Oluwatobi
import java.util.Scanner;
    public class Multilple{
        public static void main(String [] args)
        {
            int num1, num2;
            Scanner input = new Scanner(System.in);

            //checks if first number is multiple of the second
            System.out.println("Enter two numbers: ");
            num1 = input.nextInt();
            num2 = input.nextInt();

            int multiple = num1 / num2;
            int value = multiple * num1;

            if(value == num1)
                 System.out.printf("%d is a multiple of %d%n", num1, num2);
            if(value != num1)
                System.out.printf("%d is not a multiple of %d", num1, num2);

            input.close();
           
         }
    }

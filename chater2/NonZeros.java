//This program takes 5 inputs and determines number of positive inputs, negative and zero inputs
//@ author oluwatobi
import java.util.Scanner;

    public class NonZeros
    {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            
            int num1, num2, num3, num4, num5;
            int positive = 0, negative = 0, zero = 0;
            int counter = 1;
            // System.out.println("Enter numbers: ");
            // num1 = input.nextInt();
            // num2 = input.nextInt();
            // num3 = input.nextInt();
            // num4 = input.nextInt();
            // num5 = input.nextInt();

            // if(num1 < 0)
            while(counter <= 5)
            {
                System.out.println("Enter numbers: ");
                num1 = input.nextInt();

                if(num1 < 0)
                {
                    negative += 1;
                }
                if(num1 > 0)
                {
                    positive += 1;
                }
                if(num1 == 0)
                    zero +=1;
                
                counter++;
            }
            System.out.printf("%d positive inputs %n%n%d negative inputs %n%n%d zero inputs%n", positive, negative, zero);
            
        }
    }
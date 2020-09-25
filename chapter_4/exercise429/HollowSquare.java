package chapter4.exercise429;
import java.util.Scanner;

public class HollowSquare {
	
	    
	        public static void main(String[] args)
	    {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter size of square sides: ");
	        int size = input.nextInt();
	       
	        int row = 1;
	        
	        while (row >= 1)
	        {
	            int top = 1; // loop through once for square top
//	            int set = size + 1; //to set the size of the square
	            System.out.print("");
	         while (top <= size)
	             {
	             System.out.print("*");
	                 ++top;
	             }
	        System.out.println();

	            int sides = 1;
	            int loop = size * 2 ; // to find modulus of num1 by itself and its multiple
	         while(sides <= size)
	            {
	                int h = size;
	                
	             while(h <= loop)
	                {
	                 System.out.print(h % size== 0 ? "*" : " ");
	                  
	                  h++;
	                }
	                sides++;
	                 System.out.println();
	            
	            }
	            int bottom = 1;
	            while (bottom<= size)
	            {
	            System.out.print("*");
	       
	                ++bottom;
	            }
	        --row;
	         System.out.println();   // System.out.println();
	        }
	        input.close();
	       
	    }
	}


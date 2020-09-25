//Car pooling savings calculator 
//@ oluwatobi
import java.util.Scanner;
    public class PoolingCalculator
    {
        public static void main(String [] args)
        {
            Scanner input = new Scanner(System.in);

            //Initialization Phase
        int totalMilesPerday; //total miles per gallon
        int costPerGallon;
        int averageMPG; // average miles per gallon
        int parkingfees;
        int tolls; 
        double gallons;
        double totalSpent;

        System.out.println("Enter total miles travelled per day: ");
        totalMilesPerday = input.nextInt();

        System.out.println("Enter Cost per gallon used: ");
        costPerGallon = input.nextInt();

        System.out.println("Enter Average miles travelled per gallons used: ");
        averageMPG = input.nextInt();

        System.out.println("Enter parking fees per day: ");
        parkingfees = input.nextInt();

        System.out.println("Enter total tolls per day: ");
        tolls = input.nextInt();

        input.close();

        //Process Phase 
        gallons = (double) totalMilesPerday / averageMPG; // find total gallon used for total miles travelled 
        costPerGallon *= gallons; // calculate total cost of gallons used

        totalSpent = costPerGallon + tolls + parkingfees;

        System.out.printf("Total cost of going to work per day is: $ %.2f", totalSpent);



        }
    }

        


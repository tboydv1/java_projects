//Program calculate maximum heart rate and target heart rate
//Oluwatobi
import java.util.Scanner;
    public class HeartRateTest
    {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);

            System.out.println("Welcome to Heart Rate Calculator Program ");
            System.out.println("Enter first name: ");
            String firstN = input.nextLine(); //Stores first name

            System.out.println("Enter last name: ");
            String lastN = input.nextLine(); //Store lastname 

            System.out.print("Enter date of birth \n" + "Month: ");
            int month = input.nextInt();
            System.out.print("Day: ");
            int day = input.nextInt();
            System.out.print("Year: ");
            int year = input.nextInt();

            HeartRate person1 = new HeartRate(firstN, lastN, month, day, year);
            System.out.println();
            System.out.println("Name: "+person1.getFirstName()+" "+ person1.getLastName());
            System.out.println("Date of Birth is: "+ person1.returnDOB());
            System.out.println("Age: "+person1.calculateAge()+"");
           
            System.out.println("Maximum heart rate is: " + person1.calculateMaxHeartRate()+"");
            System.out.println("Target heart rate is: " + person1.calculateTargetRate()+"");




        }
    }
// Program print persons health status 
//Oluwatobi
import java.util.Scanner;
public class HealthProfileTest
{
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        //user prompt 
        System.out.println("This is an Health Profile Program");
        System.out.println("Enter first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter last name: ");
        String lastName = input.nextLine();
        
        System.out.println("Enter gender: ");
        String gender = input.nextLine();

        System.out.println("Enter date of birth");
        System.out.println("Enter month: ");
        int month = input.nextInt();

        System.out.println("Enter day: ");
        int day = input.nextInt();

        System.out.println("Enter year: ");
        int year = input.nextInt();

        System.out.println("Enter weight in inches: ");
        int weight = input.nextInt();

        System.out.println("Enter height: ");
        int height = input.nextInt();

        HealthProfile profile1 = new HealthProfile(firstName, lastName, gender, month, day, year, weight, height);

        System.out.println();
        System.out.println("Health Profile Record");
        System.out.printf("First name: %s%n", firstName);
        System.out.printf("Last name: %s%n", lastName);
        System.out.printf("Gender: %s%n", gender);
        System.out.printf("Date of Birth: %s%n", profile1.returnDOB());
        System.out.printf("Weight: %d%n", profile1.getWeight());
        System.out.printf("Height: %d%n", profile1.getHeight());
        System.out.printf("Age: %d years%n", profile1.calculateAge());
        System.out.printf("Body Max Index: %d%n", profile1.calculateBMI());
        System.out.printf("Maximum Heart Rate: %d%n", profile1.calculateMaxHeartRate());
        System.out.printf("Target Heart Rate: %.2f%n%n", profile1.calculateTargetRate());
        
        System.out.println("BMI values\nunderweight: less than 18.5\nNormal: between 18.5 and 24.9\noverweight: between 25 and 29.9\nobese: 30 or greater");

        

    }
}
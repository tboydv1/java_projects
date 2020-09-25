//This program calculates user body max index 
//oluwatobi 
import java.util.Scanner;

    public class BodyMaxIndex
    {
        //instance variables 
        private int weightInpounds;
        private int heightInInches;
        private int weightInKilograms;
        private int heightInMeters;

        public int calculateBMI(int weight, int height)
        {
            int BMI = weight / height * height;
            return BMI;
        }
        public int calculateBMIPounds(int weight, int height)
        {
            int BMI2 = weight * 703 / height * height;
            return BMI2;
        }
    

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in Kilogram: ");
        int weight1 = input.nextInt();

        System.out.println("Enter height in metres: ");
        int height = input.nextInt();

        BodyMaxIndex user = new BodyMaxIndex();
        System.out.println("Body Max Index is: " + user.calculateBMI(weight1, height)+ "\n");
        input.close();

        System.out.println("BMI values\nunderweight: less than 18.5\nNormal: between 18.5 and 24.9\noverweight: between 25 and 29.9\nobese: 30 or greater");
    }
    }
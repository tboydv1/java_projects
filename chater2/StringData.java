//Import class scanner from Java class Libraries
import java.util.Scanner;

//
public class StringData {
    //main method
    public static void main(String[] args) {
        String name = "Tobi";
        
        Scanner Profile1 = new Scanner(System.in);

        System.out.print("Enter Name "); //prompt user for imput 
        String Name = Profile1.nextLine();//User inputs first string argument

        System.out.print("Enter Occupation ");//promt user for input
        String Occupation = Profile1.nextLine();//User inputs Second string argument

        System.out.print("Enter Age ");//Promt user for input 
        int Age = Profile1.nextInt(); //user inputs intger arguments(age)


       
        //Display data in order of entry 
        System.out.printf("Hello %s!%n", "there");
        System.out.printf("My name is %s!%n", Name);
        System.out.printf("I am a %s!%n", Occupation);
        System.out.println("I am " + Age + " years old.");
        System.out.println("Hi " + name);
       
        Profile1.close();

    }//end of main method

}//end of Calss StringData



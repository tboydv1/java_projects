//This program displays date
import java.util.Scanner;
    public class DateTest
    {
        public static void main(String[] args)
        {
            Date nigeria = new Date(06,04,2019);
            Scanner input = new Scanner(System.in);

             nigeria.displayDate();
          
            System.out.println("Set new Date");
            System.out.print("Enter month: " );
            int month = input.nextInt();
            System.out.print("Enter day: ");
            int day = input.nextInt();
            System.out.print("Enter year: ");
            int year = input.nextInt();

            nigeria.setMonth(month); nigeria.setDay(day); nigeria.setYear(year);

            System.out.println();
            System.out.println("New date is " + nigeria.displayDate());

        }
        
    }

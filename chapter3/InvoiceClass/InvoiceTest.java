//This program uses invoice class to calsulate invoce Amount and view Invoice 
//@oluwatobi 
import java.util.Scanner;
    public class InvoiceTest
    {
        public static void main (String[] args) 
        {
            Scanner input = new Scanner(System.in);
            
            //product Information 
            System.out.println("Enter Product number: ");
            String type = input.nextLine();

            System.out.println("Enter Product Description: ");
             String words = input.nextLine();

            System.out.println("Enter quantity: ");
            int description = input.nextInt();

            System.out.println("Enter Price: ");
            int price = input.nextInt();
     
            Invoice checkout = new Invoice(type, words, description, price); 
            
            System.out.println();
             System.out.printf("Part number: %s%nPart description: %s%nQuantity: %d%nPrice per item: %.2f%nInvoice amount is: %.2f",checkout.getNumber() ,
            checkout.getDescription(), checkout.getQuantity(), checkout.getUntitPrice(), checkout.getInvoiceAmount());
        }
    }
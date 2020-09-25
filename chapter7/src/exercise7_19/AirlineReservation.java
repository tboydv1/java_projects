package exercise7_19;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author tboydev
 *(Airline Reservations System) A small airline has just purchased a computer 
 *for its new automated reservations system. You’ve been asked to develop the new system. 
 *You’re to write an application to assign seats on each flight of the airline’s only plane (capacity: 10 seats).
Your application should display the following alternatives: Please type 1 for First Class and
Please type 2 for Economy. If the user types 1, your application should assign a seat in the firstclass section (seats 1–5).
 If the user types 2, your application should assign a seat in the economy
section (seats 6–10). Your application should then display a boarding pass indicating the person’s
seat number and whether it’s in the first-class or economy section of the plane.
Use a one-dimensional array of primitive type boolean to represent the seating chart of the
plane. Initialize all the elements of the array to false to indicate that all the seats are empty. As
each seat is assigned, set the corresponding element of the array to true to indicate that the seat is
no longer available.
Your application should never assign a seat that has already been assigned. When the economy
section is full, your application should ask the person if it’s acceptable to be placed in the first-class
section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
"Next flight leaves in 3 hours."
 */
public class AirlineReservation {
	
	static boolean [] airlineSeats = new boolean[11];
	static Scanner in = new Scanner(System.in);
	static Random atRandom = new Random();
	

	private enum Status {Sold, Yes};

	public boolean assignFirstClass() {
		boolean book;
		
		for(int seats = 0; seats < 5; seats++) {
			
			book = airlineSeats[seats]; 
			if(book == false) {
				System.out.printf("%s%n%s[%02d]%n%s%n%n","BOARDING PASS","Seat No is: ", seats + 1, "Section: First-class");
				airlineSeats[seats] = true;
				return true;
			}
			
		}
		return false;
		
	}
	public boolean bookEconomy() {
		boolean book; 
		for(int seats = 5; seats < 11; seats++ ) {
			book = airlineSeats[seats];
			if(book == false) {
				System.out.printf("%s%n%s[%02d]%n%s%n%n","BOARDING PASS","Seat No is: ", seats + 1 , "Section: Economy-class");
				airlineSeats[seats] = true;
				return true;
			}
		}
		return false;
	}
	
	public void assignSeats() throws InputMismatchException {
		int customer = 0;
		boolean check;
		char option = 'y';
		
		Status allSeats = availableSeats();
		System.out.println("Welcome to Arik Air!");
		
			
				while(allSeats == Status.Yes) {
					
					System.out.println("Please type 1 for First Class and type 2 for Economy.");
			customer = in.nextInt();
			if(customer == 1) {									//assign appropriate seats
				check = assignFirstClass();
				if(check == true) {
					System.out.println("Thank You!\n");
				}
				else {//offer seat alternatives
					System.out.println("First-class section is full\nWould you like a to be placed in economy-class ?[y/n]");
					
						 option = in.next().charAt(0);
				
					if(option == 'y') {
						check = bookEconomy();
						if(check == true) {
							System.out.println("Thank You!\n");
						}
						else 
							System.out.println("Next Flight leaves in 3 hours\n");
					}
					else {
						System.out.println("Next Flight leaves in 3 hours\n");
					}
				}
			}
			
			else if(customer == 2) {
				check = bookEconomy();
				if (check == true) {
					System.out.println("Thank You!\n");
				}
				else {
					System.out.println("Economy class is full\nWould you like to be placed in first class ?[y/n]");
					
					 option = in.next().charAt(0);
					
					
					if(option == 'y') {
						check = assignFirstClass();
						if(check == true)
						System.out.println("Thank you!\n");
						else
							System.out.println("Next Flight leaves in 3 hours\n");
					}
					else {
						System.out.println("Next Flight leaves in 3 hours\n");
					}
				}
				}
			//check if seats are still available
			allSeats = availableSeats();
			
				}
			
		
		
		if(allSeats == Status.Sold) {
			System.out.println("All seats sold. Next Flight leaves in 3 hours");
		}
		
	}
	public Status availableSeats() { //check if seats are still available
		
		for(boolean flightSeats: airlineSeats) {
			if(flightSeats == false) {
				return Status.Yes;
			}
		}
		
		return Status.Sold;
	}
	
	
	
	
}

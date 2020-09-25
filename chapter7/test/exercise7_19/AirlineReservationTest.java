package exercise7_19;

import java.util.InputMismatchException;

public class AirlineReservationTest {

public static void main(String[] args) {

		
		AirlineReservation arik = new AirlineReservation();
		try {
		arik.assignSeats();
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		
		}

	}
}

package exercise7_28;


import java.util.Random;

public class AnimalRace {

	int[] track = new int[70];
	
	int tortoise = 1;
	int hare = 1;
	
	Tortoise adamu = new Tortoise();
	Hare speedy = new Hare();
	Random m = new Random();
	
	public void simulateRace() {
		int moveNo;
		
		System.out.printf("BANG !!!!!%nAND THEY'RE OFF !!!!%n");
		
		while(tortoise < 70 && hare < 70) {
		
			
			moveNo = 1 + m.nextInt(10);

			tortoise += adamu.move(moveNo);
			hare += speedy.move(moveNo);
			
			if(tortoise < 1 ) {
				tortoise = 1;
			}
			if(hare < 1) {
				hare = 1;
			}
			
			
			displayTrack();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
			if(tortoise >= 70 && hare < 70) {
				System.out.println("\nTortoise Wins!!!!YAY!!!!\n");
				System.out.println("Rewarded with a pail of fresh carrots and lettuce {*}");
			
			}
			else if(hare >= 70 && tortoise < 70) {
				System.out.println("\nHare Wins.Yuch\n");
				System.out.println("Rewarded with a pail of fresh carrots and lettuce {*}");
			}
			else if(hare == tortoise) {
				System.out.println("It's a tie");
			}
			
	}
	public void displayTrack() {
		
		for(int i = 1; i < 80; i++ ) {
			
			if(i == tortoise && i == hare) {
				System.out.print("OUCH!!");
				i = i + 5;
			}
			else if(i == tortoise)
				System.out.print('T');
			else if(i == hare)
				System.out.print('H');
			else
				System.out.print("_");
			
			if(i == 69) {
				System.out.print("||");
			}

				
		}
		System.out.println();

	}
}
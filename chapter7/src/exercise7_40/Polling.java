package exercise7_40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Polling {

	
	String topics[] = {"(1) Race is not Fate ", 
						"(2) A Page for a Tree ",
						"(3) Drinking and Driving ",
						"(4) Animals have rights ",
						"(5) Lagos traffic when?? "};
	
	int responses[][] = new int[5][10];
	Scanner input = new Scanner(System.in);
	
	public void takePoll() {
		
		receiveResponses();
		
		displayResponse();
		
		displayHighest();
		
		displayLowest();
	}
	
	public void receiveResponses() {
		int answer;
		
		System.out.println("Polling Program: input 'a' to take a poll");
		int control = input.next().charAt(0);
		
		
		try {
			while(control == 'a') {
				
		System.out.println("\nPlease rate these (5) social-consciousness issues:\nfrom 1 (least important)"
				+ " to 10 (most important)\n");
		
		for(int rate = 0; rate < topics.length; rate++ ) {
			
			System.out.printf("%s %n", topics[rate]);
			
			
			
				answer = input.nextInt();
			++responses[rate][answer -1];
	
			}
			System.out.println("Enter 'a' to take next poll or 'z' to quit");
			control = input.next().charAt(0);
			}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				
			}
			catch(InputMismatchException c) {
				System.out.println(c.getMessage());
			}
//			System.out.println();
			}
//		}
//	}
//	
	public void displayResponse() {
		
		System.out.printf("Polling Summary:%n%36s%n%n","Responses:");
		System.out.print("                         ");
		
		for(int i = 0; i < responses[0].length; i++) 
			System.out.printf("%5d", i + 1);
		
		System.out.printf("%10s","Average");
		
		System.out.println("\n");
		
		for(int j = 0; j < topics.length; j++) {
			
			System.out.printf("%-25s", topics[j]);
			
		
			
			for(int rate: responses[j]) {
				
				
				System.out.printf("%5d", rate);
			
				}
			
				System.out.printf("%10.2f", averageResponse(responses[j]));
			
				System.out.println("\n");
			}
			
			
		}
	
	public void displayHighest() {
		int total = 0; 
		
		int highestPoint = 10;
		int count, issue = 0;
		
		for(count = 0; count < responses.length; count++) {
			
			for(int all = 0; all < responses[count].length; all++) {
				
				total += responses[count][all];
				
				if(all == 9) {
					if(total > highestPoint) {
						highestPoint = total;
						issue = count;
					}
				}
			}
			
			
		}
		
		System.out.printf("Issue with highest point is: %s%nPoint is: %d%n", topics[issue], highestPoint );
		
	
	}
	
	public void displayLowest() {
		int total = 0; 
		
		int lowestPoint = 0;
		int issue = 0;
		
		for(int count = 0; count < responses.length; count++) {
			
			for(int all = 0; all < responses[count].length; all++) {
				
				total += responses[count][all];
				
				if(all == 9) {
					if(total < lowestPoint) {
						lowestPoint = total;
						issue = count;
					}
				}
			}
			
			
		}
		
		System.out.printf("Issue with lowest point is: %s%nPoint is: %d", topics[issue], lowestPoint );
		
	
	}
	
	public double averageResponse(int[] responses) {
		
		double total = 0;
		
		for(int answer: responses) {
			
			total += answer;
		}
		
		return total / responses.length;
	}
		
		
	public static void main(String[] args) {

		Polling issues = new Polling();
		
		issues.takePoll();
	}
		
		
	
}
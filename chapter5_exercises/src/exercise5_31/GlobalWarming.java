package exercise5_31;

import java.util.Scanner;

public class GlobalWarming {

	
	public void displayQuiz() {
		Scanner input = new Scanner(System.in);
		int quizCounter = 1;
		int correct = 0, answer = 0;
		
		while(quizCounter <= 5)
		{
			switch(quizCounter) {
			case 1: 
				System.out.printf("%s%n%s%n%s%n%s%n%s%n", "What are the 4 hottest years in NASA's global warming record?",
						"1) 2000, 2001, 2003, 2005", "2) 2015, 2016, 2017, 2018", 
						"3) 1991, 1995, 1981,1999", "4) 1885, 1867, 1876,1888");
				 answer = input.nextInt();
				 if(answer == 2) {
					 System.out.println("correct!");
					 correct++; 
				 }
				break;
			case 2:
				System.out.printf("%s%n%s%n%s%n%s%n%s%n", "What is the second largest source of carbon pollution in the USA?",
						"1) Agricultural sector", "2) Manufacturing sector", 
						"3) Transportation sector", "4) Mining sector");
				 answer = input.nextInt();
				 if(answer == 3) {
					 System.out.println("correct!");
					 correct++;	
				 }
				 break;
			case 3: 
				System.out.printf("%s%n%s%n%s%n%s%n%s%n", "What causes global worming?",
						"1) Air pollutants trapped in space", "2) Fumes", 
						"3) Oil spillage", "4) Earth crust radiation");
				 answer = input.nextInt();
				 if(answer == 1) {
					 System.out.println("correct!");
					 correct++;	
				 }
				 break;
			case 4: 
				 System.out.printf("%s%n%s%n%s%n%s%n%s%n", "What are the environment effects of global warming?",
							"1) Bad roads, fuel scarcity", "2) Unhealthy foods, polluted water", 
							"3) Melting glaciars, snowmelt, severe drought", "4) Loss of business");
					 answer = input.nextInt();
					 if(answer == 3)
						 System.out.println("correct!");
						 correct++;
					 break;
			case 5: 
				System.out.printf("%s%n%s%n%s%n%s%n%s%n", "What country contributes the highest to global warming?",
						"1) USA", "2) India", 
						"3) China", "4) Nigeria");
				 answer = input.nextInt();
				 if(answer == 3)
					 System.out.println("correct!");
					 correct++;
				 break;
			
				
			}
			System.out.println();
			quizCounter++;
		}
		input.close();
		switch(correct) {
		case 5:
			System.out.println("Execellent!");
			break;
		case 4: 
			System.out.println("Very Good!");
			break;
		case 3: case 2: case 1: case 0: 
			System.out.println("Time to brush up on your knowledge on global worming"+ 
		"\nVisit www.nrdc.org to learn more on global warming!");
			break;
			
		
		}
	}
	
}

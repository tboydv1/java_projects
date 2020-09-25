package exercise5_29;

public class Christmas_Song {

	public void displayChristmasSOng() {
		int days = 1;
		int verse = 13;
	
		while(days <= 12) {
			
			switch(days) 
			{
			case 1:
				System.out.println("On the first day of Christmas my true love sent to me");
				break;
			case 2:
				System.out.println("On the second day of Christmas my true love sent to me");
				break;
			case 3: 
				System.out.println("On the third day of Christmas my true love sent to me");
				break;
			case 4:
				System.out.println("On the fourth day of Christmas my true love sent to me");
				break;
			case 5: 
				System.out.println("On the fifht day of Christmas my true love sent to me");
				break;
			case 6: 
				System.out.println("On the sixth day of Christmas my true love sent to me");
			case 7: 
				System.out.println("On the seventh day of Christmas my true love sent to me");
				break;
			case 8: 
				System.out.println("On the eight day of Christmas my true love sent to me");
				break;
			case 9: 
				System.out.println("On the ninth day of Christmas my true love sent to me");
				break;
			case 10: 
				System.out.println("On the tenth day of Christmas my true love sent to me");
				break;
			case 11: 
				System.out.println("On the eleventh day of Christmas my true love sent to me");
				break;
			case 12: 
				System.out.println("On the twelvth day of Christmas my true love sent to me");
				break;
			
			}
			
			switch(verse)
			{
			case 24:
				System.out.println("Twelve drummers drumming ");
				
			case 23:
				System.out.println("Eleven pipers pipping");
				
			case 22: 
				System.out.println("Ten lords a -leaping");
				
			case 21:
				System.out.println("Nine ladies dancing");
				
			case 20: 
				System.out.println("Eight maids a -milking ");
				
			case 19: 
				System.out.println("Seven swams a - swimming ");
				
			case 18: 
				System.out.println("Six geese a  -laying ");
				
			case 17: 
				System.out.println("Five gold rings ");
				
			case 16: 
				System.out.println("Four calling birds ");
				
			case 15: 
				System.out.println("Three french hens ");
				
			case 14: 
				System.out.println("Two turtle doves and");
				
			case 13: 
				System.out.println("A patridge in a pear tree");
				
			
			}
			System.out.println();
			days++; verse++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Christmas_Song chorus = new Christmas_Song();
		
		chorus.displayChristmasSOng();
	}

}

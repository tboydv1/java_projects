package examples;

import java.util.Arrays;
import java.util.LinkedList;

public class ListView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] colors = {"black", "blue", "yellow"};
		LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
		
		links.addLast("red");
		links.add("pink");
		links.add(3, "green");
		links.addFirst("cyan");
		
//		for(String color: colors) {
//			
//			System.out.print(color+ " " );
//		}
//		
		colors = links.toArray(new String[links.size()]);
		
		System.out.println("colors: ");
		
		for(String color: colors) {
			System.out.println(color);
		}
		
		
	}

}

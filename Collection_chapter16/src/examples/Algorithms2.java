package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] colors = {"red", "white", "yellow", "blue"};
		List<String> list1 = Arrays.asList(colors);
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("black");
		list2.add("red");
		list2.add("green");
		
		System.out.print("list1 contains: ");
		
		//display elements in list2
		for(String s: list1) {
			System.out.printf("%s ", s);
		}
		System.out.println();
		
		System.out.print("Before AddAll, list2 contains: ");
		
		//display elements in list2
		for(String s: list2) {
			System.out.printf("%s ", s);
		}
		System.out.println();
		
		Collections.addAll(list2, colors);
		
		System.out.printf("%nAfter addAll, list2 contains: ");
		for(String s: list2) {
			System.out.printf("%s ", s);
			
		}
		System.out.println();
		
		//get frequency of "red"
		int frequency = Collections.frequency(list2, "red");
		System.out.printf("%nFrequency of red in list2: %d%n", frequency);
		
		//check whether list1 and list2 have elements in common
		boolean disjoint = Collections.disjoint(list1, list2);
		
		System.out.printf("list and list2 %s elements in common%n", disjoint ? "do not have": "have");
	}

}

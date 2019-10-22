package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an ArrayList<String> from colors array
		
		String[] colors = {"red", "white", "blue", "black", "yellow", 
				"purple", "tan", "pink"
		};
		
		List<String> list = new ArrayList<>(Arrays.asList(colors));
		
		Collections.sort(list);
		System.out.printf("Sorted ArrayList: %s%n", list);
		
		//search list for values
		printSearchResults(list, "black");
		printSearchResults(list, "red");
		printSearchResults(list, "pink");
		printSearchResults(list, "aqua");
		printSearchResults(list, "gray");
		printSearchResults(list, "tea");
		
		
	}
	private static void printSearchResults(List<String> list, String key) {
		
		System.out.printf("%nSearching for: %s%n", key);
		int result = Collections.binarySearch(list, key);
		
		if(result >= 0) {
			System.out.printf("Found at index %d%n", result);
		}
		else {
			System.out.printf("Not Found(%d)%n", result);
		}
		
	}
	

}

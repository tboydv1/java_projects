package examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create and display a list
		String[] colors = {"red", "white", "blue", "green", "gray",
				"orange", "tan", "white", "cyan", "peach", "gray", "orange"};
		List<String> list = Arrays.asList(colors);
		
		System.out.printf("List: %s%n", list);
		
		//eliminate duplicates then print the unique values
		//create a HashSet
		Set<String> set = new TreeSet<>(list);
		
		System.out.printf("%nNonduplicates are: ");
		
		for(String value: set) {
			System.out.printf("%s ", value);
		}
	}

}

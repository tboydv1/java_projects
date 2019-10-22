package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordTypeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create HashMap to store String keys and Integer values
		Map <String, Integer>  myMap = new HashMap<>();
		createMap(myMap);
		displayMap(myMap);
		
		
		
	}
	private static void createMap(Map<String, Integer> map) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scan.nextLine();
		
		//tokenize the input
		String[] tokens = input.split(" "); 
		
		//processing input text
		for(String token: tokens) {
			String word = token.toLowerCase();
			
			//if the map contains the word
			if(map.containsKey(word)) {
				
				int count = map.get(word);
				map.put(word, count + 1);
				
			}
			else {
				
				map.put(word, 1);
			}
		}
		scan.close();
	}
	
	private static void displayMap(Map<String, Integer> map) {
		
		Set<String> keys = map.keySet();
		
		//sort keys
		TreeSet<String> sortedKeys = new TreeSet<>(keys);
		
		System.out.printf("%nMap contains:%nKey\t\tValue%n");
		
		//generate output for each key in map
		
		for(String key: sortedKeys) {
			
			System.out.printf("%-10s%10s%n", key, map.get(key));
	}
		
		System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
		
		
	}
	

}

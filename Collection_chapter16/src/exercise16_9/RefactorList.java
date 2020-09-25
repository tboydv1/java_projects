package exercise16_9;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class RefactorList {

//	private static final String ListIterator = null;

	public static void main(String[] args) {
		String[] colors = {
				"black", "yellow", "green", "blue", "violet", "silver"
		};
		
		List<String> list1 = new LinkedList<>(Arrays.asList(colors));
		
		String[] colors2 = {
				
				"gold", "white", "brown", "blue", "gray", "silver"
				
		};
		
		List<String> list2 = new LinkedList<>(Arrays.asList(colors2));
		
		list1.addAll(list2); //concatenate lists

		list2 = null;
		
		printList(list1);
		convertToUppercaseString(list1);
		printList(list1);
		
		System.out.printf("Deleting element 4 to 6...");
		removeItems(list1, 4, 7);
		printList(list1);
		printReversedList(list1);
		
		
	}
	
	public static void printList(List<String> list) {
		
		System.out.printf("%nlist:%n");
		
		for(String item: list) {
			
			System.out.printf("%s ", item);
		}
		System.out.println();
	}
	
	public static void convertToUppercaseString(List<String> list) {
		
		ListIterator<String> iterator = list.listIterator();
		String item;
		while(iterator.hasNext()) {
			
			item = iterator.next();
			iterator.set(item.toUpperCase());
//			System.out.print(item +" ");
		}
		
	}
	
	private static void removeItems(List<String> list, int start, int end) {
		
		list.subList(start, end).clear();
	}
	
	private static void printReversedList(List<String> list) {
		 
		ListIterator<String> iterator = list.listIterator(list.size());
		
		while(iterator.hasPrevious())
			System.out.printf("%s ", iterator.previous());
	}
 }

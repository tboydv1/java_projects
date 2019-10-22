package examples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import examples.Time1;


public class ComparatorSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Time1> list = new ArrayList<>();
		
		list.add(new Time1(6, 24,34));
		list.add(new Time1(18,14, 58));
		list.add(new Time1(6, 05, 34));
		list.add(new Time1(12, 14, 58));
		list.add(new Time1(6, 24, 22));
		
		System.out.printf("Unsorted array elements:%n%s%n", list);
		
		Collections.sort(list, new TimeComparator());
		
		System.out.printf("sorted array elements:%n%s%n", list);
	}

}

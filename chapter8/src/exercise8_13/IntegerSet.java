package exercise8_13;

import java.util.Arrays;

public class IntegerSet {

	
	
	private static final int SIZE = 101;
	private boolean set[] = new boolean[SIZE];
 
	
	public IntegerSet() {
		
		Arrays.fill(set, false);
	}
	
	public static boolean[] union(IntegerSet setA, IntegerSet setB) {
		
		boolean newSet[]  =  new boolean[SIZE];
		
		for(int j = 0; j < SIZE;  j++) {
			
			if(setA.getAllSet()[j] == true || setB.getAllSet()[j] == true) {
				newSet[j] = true;
			}
			else 
				newSet[j] = false;
			
		}
		
		return  newSet;
		
	}
	
	public static boolean[] intersection(IntegerSet setA, IntegerSet setB) {
		
		 boolean newSet[] = new boolean[101];
		 
		 for(int i = 0; i < SIZE; i++) {
			 
			 if(setA.getAllSet()[i] ==  false|| setB.getAllSet()[i] == false) {
					newSet[i] = false;
				}
			 else newSet[i] = true;
		 }
		 
		 return  newSet;
	}
	
	public void insertElement(int indexNo) {
		set[indexNo] = true;
	}
	
	public void deleteElement(int indexNo) {
		set[indexNo] = false;
	}
	
	public String toString() {
		int count = 0;
		String setValue= "";
		for(int i = 0 ; i < set.length; i++) {
			if(set[i] == true) {
				
				setValue = setValue + " " + i;
				count++;
			}
			
		}
		if(count == 0)
			setValue = "---";
		
		return String.format("%s%s%s%n","[", setValue,"]");
	}
	
	public boolean isEqualTo(IntegerSet setB) {
	
		
		boolean result = Arrays.equals(this.getAllSet(), setB.getAllSet());
		
		return result;
	}
	
	public boolean getSet(int index) {
		
		return set[index];
	}
	
	public boolean[] getAllSet() {
		
		return set;
	}

	
	
}

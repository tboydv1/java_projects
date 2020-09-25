package exercise16_10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class DuplicateEliminator {

	private Set<String> firstNames;
	
	
	public Set<String> getFirstNames() {
		return firstNames;
	}

	public void setFirstNames(Set<String> firstNames) {
		this.firstNames = firstNames;
	}

	/*
	 * Read name from specified path and store in list
	 */
	public List<String> readNames(Path file) throws IOException {
		
		if(Files.exists(file) == false) {
			throw new FileNotFoundException("File does not exist");
		}
		Stream<String> firstname;
		
		BufferedReader reader = new BufferedReader(Files.newBufferedReader(file));
		
		firstname = reader.lines();
		
		List<String> names = new ArrayList<>(firstname.collect(Collectors.toList()));
		
		reader.close();
		
		return names;
		
	}
	
	public Set<String> eliminateDuplicates(List<String> names) {
		
		Set<String> uniqueNames = new HashSet<>(names);
		
		this.setFirstNames(uniqueNames);
		
		return uniqueNames;
	}
	
	public boolean searchName(String name, Set<String> nameSet ) {
		
		for(String n : nameSet) {
			
			if(n.equals(name)) {
				return true;
			}
		}
		return false;
	}
	 	
	
	
}

package exercise14_25;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CrosswordPuzzle {
	
	private Map<Integer, String> accross = new HashMap<>();
	
	private Map<Integer, String> down = new HashMap<>();
	
	private Path directory;
	
	public CrosswordPuzzle(String directory_str) {
		
		Path directoryPath = Paths.get(directory_str);
		
		if(Files.isDirectory(directoryPath) == false) {
			throw new IllegalArgumentException("Path is not a directory");
		}
		
		this.directory = directoryPath;
		
		
	}
	
	public CrosswordPuzzle() {
		
	}
	
	public Path getDirectory() {
		return directory;
	}
	
	public void setDirectory(Path directory) {
		this.directory = directory;
	}

	public Map<Integer, String> getAccross() {
		return accross;
	}

	public void setAccross(Map<Integer, String> accross) {
		this.accross = accross;
	}

	public Map<Integer, String> getDown() {
		return down;
	}

	public void setDown(Map<Integer, String> down) {
		this.down = down;
	}

	public void getPuzzleWords() throws IOException {
		
		DirectoryStream<Path> directoryStream = Files.newDirectoryStream(getDirectory());
		
		for(Path files: directoryStream) {
			
			if(files.getFileName().toString().equals("Accross.txt")) {
				
				Scanner scan = new Scanner(Paths.get(files.toString()));
				
				while(scan.hasNext()) {
					
					getAccross().put(scan.nextInt(), scan.next());
					
				}
				scan.close();
				
			}
			else if(files.getFileName().toString().equals("Down.txt")) {
				
//				System.out.println(files.getFileName());
				
				Scanner scan = new Scanner(Paths.get(files.toString()));
				
				while(scan.hasNext()) {
					
					getDown().put(scan.nextInt(), scan.next());
					
				}
				scan.close();
				
			}
			
		}
	}
	
	public void displayPuzzleWord() {
		
		Set<Integer> keys = getAccross().keySet();
		
		for(int key : keys) {
			
			System.out.printf("%d\t%s%n", key, getAccross().get(key));
		}
	
		System.out.println();
		Set<Integer> dkeys = getDown().keySet();
		
		for(int dkey : dkeys) {
			
			System.out.printf("%d\t%s%n", dkey, getDown().get(dkey));
		}
	}
	
	public void guessPuzzle(int Key, String word) {
	
		//check if guess exist and corresponds
		
		
	}
	
	
	
	
	

	
	 
}

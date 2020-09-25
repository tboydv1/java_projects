package examples;

	import java.io.IOException;
	import java.nio.file.DirectoryStream;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.util.Scanner;

	public class FileAndDirectoryInfo {

		public static void main(String[] args) throws IOException{
		

			Scanner input = new Scanner(System.in);

			System.out.println("Enter file or directory name: ");

			// create path object baseed on user input
			Path path = Paths.get(input.nextLine());

			if (Files.exists(path))
			{
				System.out.printf("%n%s exists%n", path.getFileName());
				System.out.printf("%s a directory%n", Files.isDirectory(path) ? "Is" : "Is not");
				System.out.printf("%s an absolute path%n", path.isAbsolute() ? "Is" : "Is not");
				System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path));
				System.out.printf("Size: %s%n", Files.size(path));
				System.out.printf("Path: %s%n", path);
				System.out.printf("Absolute path: %s%n", path.toAbsolutePath());

				if(Files.isDirectory(path))
				{

					System.out.printf("%nDirectory contents:%n");


					//object for iterating through a directory's contents
					DirectoryStream<Path> testStream = 
						Files.newDirectoryStream(path);

					for(Path p : testStream)
						System.out.println(p);
				}
			}
			else
				System.out.printf("%s does not exist%n", path);
		
	}
}

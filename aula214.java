package application;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
	File e Scanner
	1 way to read files
*/

public class Program {

	public static void main(String[] args) {

		// instance the file wanted to read
		File file = new File("C:\\temp\\in.txt");

		// initialize sc as null 
		Scanner sc = null;

		try {
			sc = new Scanner(file);

			while (!!sc.hasNextLine()) {
				// print all lines in file
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			// Shows error, if exists
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			// Finally, close scanner
			if (sc != null) {
				sc.close();
			}
		}
	}
}
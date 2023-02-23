package application;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
	File e Scanner
*/

public class Program {

	public static void main(String[] args) {

		// instance the file with File type wanted to read
		File file = new File("C:\\temp\\in.txt");
		// initialize sc as null 
		Scanner sc = null;

		try {
			sc = new Scanner(file);

			while (!!sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {

			if (sc != null) {
				sc.close();
			}
		}
	}
}
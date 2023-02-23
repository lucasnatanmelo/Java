package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
	2 way to read files
*/

public class Program {

	public static void main(String[] args) {
		
		// path with the file location
		String path = "C:\\temp\\in.txt";
		BufferedReader br = null;
		FileReader fr = null;
		
		try {

			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String line = br.readLine();
			
			while (line != null) {
				// Read every line
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			// Shows errors if exists
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				// Closes Buffer Reader and File Reader
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
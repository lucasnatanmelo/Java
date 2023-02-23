package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		// Default setup 
		Scanner sc = new Scanner(System.in);

		// Creates a Map data structure String|Integer
		Map<String, Integer> votes = new LinkedHashMap<>();

		// User enters with file path
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		// File read method
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {

				// Read each line and stores it in fields	
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);

				// Increments votes by key
				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				}
				// Insert in votes new Candidate found
				else {
					votes.put(name, count);
				}
				
				line = br.readLine();
			}
			
			// Loop through votes
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}

package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {

		// Initial setup
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// list will be an array of products
		List<Product> list = new ArrayList<>();

		// User informs a file path
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

		// Tries to read the file
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String itemCsv = br.readLine();
			while (itemCsv != null) {

				// Stores information splitting by ","
				String[] fields = itemCsv.split(",");
				
				// Following the order by "name, price, quantity"
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				// Instance a new Product and push to list
				list.add(new Product(name, price, quantity));

				// Read the next line
				itemCsv = br.readLine();
			}

			// Tries to write the .csv file
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				// Loop through list and retrieve information by Product class
				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");
				
			} 
			// Retrieves, if needed, error on writing 
			catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
			// Retrieves, if needed, error on reading 
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		sc.close();
	}
}

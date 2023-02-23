package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		// Default initial setup
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// User enter with file path
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		// Reading file method
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			// Instance a new list as arrayList
			List<Employee> list = new ArrayList<>();
			
			// Reads a line
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				/**
					fields[0] = name,
					fields[1] = email,
					fields[2] = salary,
				*/

				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			// User enter with salary
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			
			// Creates a list of emails using stream operations to:
			// filter salaries greater than the salary required
			// map and stores the email
			// sort it by email name
			List<String> emails = list.stream()
					.filter(x -> x.getSalary() > salary)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());

			// prints emails 
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
			emails.forEach(System.out::println);
			
			// Creates a variable that stores the salary with people names starting with "M"
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			// prints sum
			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}

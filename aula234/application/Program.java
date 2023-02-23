package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import entities.Employee;

public class Program {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		String path = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String employeeCsv = br.readLine();
			while (employeeCsv != null) {

				String[] fields = employeeCsv.split(",");

				// Type of list to read
				/*				
				"Lucas Natan, 5000.00"
				"Fulano de tal, 2000.00"
				"Ciclano, 3000,00"
				*/

				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}

			// Sort the list using Collections util
			Collections.sort(list);

			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

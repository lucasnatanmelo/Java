package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product; // Auto-import CTRL+SHIFT+O

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many products will exists in the list?\n")
		int n = sc.nextInt();
		// Nesse caso, o vect será uma lista de products
		Product[] vect = new Product[n];
		
		for(int i=0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		// Retorna a soma de todos os valores dos produtos
		double sum = 0.0;
		for(int i=0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE: = %.2f%n", avg);
		
		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Instancing and Initializing variable
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		// Show product data
		Product product = new Product(name, price, quantity);		
		System.out.println("\nProduct data: " + product);
		
		// Setting name and price
		product.setName("Computer");
		System.out.println("\nUpdated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("\nUpdated price: " + product.getPrice());
		
		// Adds products
		System.out.println("\nEnter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		// Show updated data
		System.out.println("\nUpdate data: " + product);
		
		// Remove products
		System.out.println("\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		// Show updated data
		System.out.println("\nUpdate data: " + product);
		
		sc.close();
		
	}

}

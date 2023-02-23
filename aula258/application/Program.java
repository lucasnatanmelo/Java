package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;
import model.services.ProductService;

public class Program {
	
	public static void main(String[] args) {

		// Default setup
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		ProductService ps = new ProductService();
		
		/*
			There are different ways to use lambda expressions
			Those ways are mentioned in 257
		*/

		// sum all product with T as a initial letter
		// p.getName().charAt(0) is a predicated
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
 
		System.out.println("Sum = " + String.format("%.2f", sum));
	}
}

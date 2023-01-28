package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		/*
			There different ways to use lambda expressions
			Those ways are mentioned in 256 lesson 
		*/
		double factor = 1.1;
		
		// In this case, we are implementing forEach consumer
		list.forEach(p -> p.setPrice(p.getPrice() * factor));

		list.forEach(System.out::println);
	}
}

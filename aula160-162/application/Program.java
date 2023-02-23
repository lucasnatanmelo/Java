package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		// Initial settings
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* 
			List of products:
			- Product
			- ImportedProduct
			- UsedProduct		
		*/
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de produtos: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Datos do produto #" + i + ":");
			
			// Info about product
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preco: ");
			double price = sc.nextDouble();
			
			// Type of product
			System.out.print("Comum, usado, importado (c/u/i)? ");
			char type = sc.next().charAt(0);
			
			// c -> common product
			if (type == 'c') {
				list.add(new Product(name, price));
			}
			// u -> used product
			else if (type == 'u') {
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}
			// i -> imported product
			else if (type == 'i'){
				System.out.print("Taxa de importacao: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			} 
			// another else
			else {
				System.out.print("Type of product not allowed. Please, write again!");
				i--;
			}
		}

		System.out.println();
		
		// Show list of products
		System.out.println("ETIQUETAS DE PRECO:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}
}

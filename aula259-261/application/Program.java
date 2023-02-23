package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		// Default setup
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			/*
			Aqui é calculada a média dos preços dos produtos contidos na lista list. Isso é feito usando a API de streaming do Java, 
			que permite processar coleções de objetos de forma simples e expressiva. Primeiro, o método stream() é chamado na lista list para criar um fluxo de objetos Product. 
			Em seguida, o método map() é chamado para extrair apenas os preços dos produtos da lista. O método reduce() é usado para calcular a soma dos preços. 
			Por fim, a média é calculada dividindo-se a soma dos preços pelo número de produtos na lista.

			*/
			double avg = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x,y) -> x + y) / list.size();
			
			System.out.println("Average price: " + String.format("%.2f", avg));
			
			/*
			É criado um objeto Comparator para ordenar os nomes dos produtos em ordem alfabética inversa.
			*/
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			/*
			São selecionados todos os produtos cujos preços são inferiores à média calculada anteriormente. 
			O método map() é usado para extrair apenas os nomes dos produtos da lista. O método `
			*/
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName()).sorted(comp.reversed())
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}

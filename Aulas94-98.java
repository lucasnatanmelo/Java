package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
	List -> Estrutura de dados dinâmica
*/

public class Program {
	public static void main(String[] args) {
		
		// list is a List with type String
		List<String> list = new ArrayList<>();
		
		// add()
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		// size()
		System.out.println(list.size());
		
		// Forma de interar na lista e arrays
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		// remoeIf() -> Remove a partir de uma condição
		// Nesse caso, todso os nomes que iniciam com 'M'
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		// indexOf() -> Retorna o index do elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("---------------------");
		
		// Armazena em result os itens seguindo condições -> Java mais atual
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		// Encontra o item que satisfaça a primeira condição e armazena em name
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}
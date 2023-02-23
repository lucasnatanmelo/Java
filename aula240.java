import java.util.Locale;
import java.util.Scanner;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}
	
	// ? -> Tipo curinga 
	// Recebe qualquer tipo de lista
	public static void printList(List<?> list) {

		// list.add(3); -> Não é possível
		// Object é o pai de todos os tipos primitivos
		for(Object obj : list){
			System.out.println(obj);
		}
	}

}

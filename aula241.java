package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
	Aula importante com diagramação de árvore de tipos herdados
*/

public class Program {
	public static void main(String[] args) {

		// Initialize the lists
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		
		copy(myDoubles, myObjs);
		printList(myObjs);
	}

	// Attention on types
	// ? extends Number -> Extends all the Number types with it's children properties
	// ? super Number -> Extends all the Number types with it's parents properties
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}

	// ? -> Receives all types of lists
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
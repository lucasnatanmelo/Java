package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
		
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		/*
		 * Como os métodos na classe Calculator são estáticos (static), não é necessário instanciar a classe por uma variável,
		 * sendo necessário somente chamar através de Calculator.metodo
		 */
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
		
	}

}

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int y = 32;
		double x = 10.35784;
		char z = 'L';

		System.out.println("Hi");

		System.out.println(y);
		System.out.println(x);

		// Configura a localização utilizada do aplicativo
		Locale.setDefault(Locale.US);

		// Para controlar a quantidade de casas decimais
		System.out.printf("%.2f%n", x);

		// Concatenar frases
		System.out.println("Resultado: " + x + "Metros");

		System.out.printf("Resultado = %.3f metros%n", x);

		// Exemplo

		String nome = "Lucas";

		int idade;
		idade = 24;

		double renda;
		renda = 4660.00;

		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);

		// Área de um trapézio
		double b, B, h, area;

		b = 6.0;
		B = 8.0;
		h = 5.0;

		area = (b + B) / 2.0 * h;

		System.out.printf("A area do trapezio é  %.2f m² %n", area);

		// Conversão utilizando casting

		int i, j;
		double resultado;

		i = 5;
		j = 2;

		resultado = (double) i / j;

		System.out.printf("Utilizando Casting: %.2f %n", resultado);

		// Entrada de dados:

		Scanner sc = new Scanner(System.in);

		// Para ler uma string
		String s;

		System.out.println("Digite um valo - String: ");
		s = sc.next();
		System.out.println("Voce digitou - String: " + s);

		// Para ler inteiros
		int n;

		System.out.println("Digite um valo - Int: ");
		n = sc.nextInt();
		System.out.println("Voce digitou - Int: " + n);

		// Para ler numeros do tipo double
		double db;
		Locale.setDefault(Locale.US);

		System.out.println("Digite um valo - Double: ");
		db = sc.nextDouble();
		System.out.printf("Voce digitou - Double: %.2f%n", db);

		// Para ler caracteres
		char c;

		System.out.println("Digite um valo - Char: ");
		c = sc.next().charAt(0);
		System.out.println("Voce digitou - Char: " + c);

		sc.close();
		
		/*
		 * Funções matemáticas - Aula 27
		 * sqrt, pow, abs, etc
		 * */
	}

}

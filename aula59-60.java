import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Locale.US auxilia para recebimento de números com "."
		// Instancia sc como uma variável do tipo Scanner
		// Utilizado para leitura de dados
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
	}
	
	// Método max retorna o maior número passado na função
	// retorna um double
	public static double max(double x, double y, double z) {
		return (x > y && x > z) ? x  
			   : (y > z) ? y 
			   : z;
	}
	
	// Método showResult é um método void
	// Somente para printar no console
	public static void showResult(double value) {
		System.out.printf("%.2f%n", value);
	}

}

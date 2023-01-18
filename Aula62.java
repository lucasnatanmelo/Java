import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
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
	
	public static double max(double x, double y, double z) {
		return (x > y && x > z) ? x  
			   : (y > z) ? y 
			   : z;
	}
	
	public static void showResult(double value) {
		System.out.printf("%.2f%n", value);
	}

}

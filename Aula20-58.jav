import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Instancia sc como uma variável do tipo Scanner
		// Utilizado para leitura de dados
		Scanner sc = new Scanner(System.in);

		// Para ler numeros do tipo double
		double db;

		System.out.println("Digite um valor - Double: ");
		db = sc.nextDouble();
		
		// Estrutura if, else if e else
		
		if (db >= 10) {
			System.out.printf("Voce digitou um valor maior que 10: %.2f%n", db);
		} else if(db <= 10 && db >= 0){
			System.out.printf("Voce digitou um valor entre 0 e 10: %.2f%n", db);
		}
		else {
			System.out.printf("Voce digitou um valor menor que 10: %.2f%n", db);
		}
		
		// Estrutura switch case
		
		int x;
		String dia;
		
		System.out.println("Digite o dia da semana - Double: ");
		x = sc.nextInt();
		
		switch(x) {
			case 1:
				dia = "Segunda-feira";
				break;
			case 2:
				dia = "Terça-feira";
				break;
			case 3:
				dia = "Quarta-feira";
				break;
			case 4:
				dia = "Quinta-feira";
				break;
			case 5:
				dia = "Sexta-feira";
				break;
			case 6:
				dia = "Sábado";
				break;
			case 7:
				dia = "Domingo";
				break;
			default:
				dia = "Invalido";
				break;
		};
		
		if(dia != "Invalido") {
			System.out.println("Dia selecionado: " + dia);
		} else {
			System.out.println("Dia invalido!");
		}
		
		// Estrutura de repetição - While
		
		int soma = 0;
		
		int value = 0;
		
		while(value != -1) {
			System.out.println("Digite valores para soma, para parar digite -1: ");
			value = sc.nextInt();
			if(value != -1){soma += value;};
		}
		
		System.out.println("Resultado da soma - For: " + soma);
				
		// Estrutura de repetição - For
		
		soma = 0;
		
		int timesToRepeat = 10;
		for(int i = 0; i < timesToRepeat; i++) {
			System.out.println("Digite valores para uma nova soma: ");
			value = sc.nextInt();
			soma += value;
		}
		
		System.out.println("Resultado da nova soma - for: " + soma);
		
		// Estrutura de repetição Do-While
		
		// Locale.US auxilia para recebimento de números com "."
		Locale.setDefault(Locale.US);
		
		char resp;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Farhrenheit: %.1f%n", F);
			System.out.print("Deseja repetir? [s/n]: ");
			resp = sc.next().charAt(0);
		} while( resp != 'n');
		
		sc.close();
		
		// Funções para manipulação de strings - Algumas
		
		/* Formatar: toLowerCase(), toUpperCase(), trim()
		 * Recortar: substring(inicio), substring(inicio, fim)
		 * Substituir: replace(char, char), replace(string, string)
		 * Buscar: IndexOf, LastIndexOf
		 * str.Split("")
		 * */
		
		String original = "abcde FGHIJ ABC abc DEFG";
		
		String stringOne = original.toLowerCase();
		String stringTwo = original.toUpperCase();
		String stringThree = original.trim();
		String stringFour = original.substring(2, 5);
		String stringFive = original.replace('a', 'x');
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + stringOne + "-");
		System.out.println("toUpperCase: -" + stringTwo + "-");
		System.out.println("trim: -" + stringThree + "-");
		System.out.println("substring: -" + stringFour + "-");
		System.out.println("replace: -" + stringFive + "-");
		System.out.println("indexOf: -" + i + "-");
		System.out.println("lastIndexOf: -" + j + "-");
		
		
		
	}

}

package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;


/*
	Running Script Example:
	
	Entre os dados do contrato:
	Numero: 222
	Data (dd/MM/yyyy): 24/08/1998
	Valor do contrato: 1000
	Entre com o numero de parcelas: 5
	
	Parcelas:
	24/09/1998 - 206.04
	24/10/1998 - 208.08
	24/11/1998 - 210.12
	24/12/1998 - 212.16
	24/01/1999 - 214.20
*/


public class Program {

	public static void main(String[] args) throws ParseException {
		
		// Default setup
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// DateTimeFormatter defines a date pattern
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		// User enters data
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		// Instances obj as Contract type
		Contract obj = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
		// Instance contractService as Contract Service type using PaypalService rules
		ContractService contractService = new ContractService(new PaypalService());
		
		// Calls processContract by obj and numbers of Installments required
		contractService.processContract(obj, n);
		
		// Shows the Installments by looping through obj.getInstallments
		System.out.println("Parcelas:");
		for (Installment installment : obj.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}
}

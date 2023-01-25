package application;

import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01))
		list.add(new BusinessAccount(1001, "Maria", 500.00, 0.01))
		list.add(new SavingsAccount(1001, "Bob", 500.00, 0.01))
		list.add(new BusinessAccount(1001, "Anna", 500.00, 0.01))

		double sum = 0.0;
		for(Account acc : list){
			sum += acc.getBalance();
		}

		for(Account acc : list){
			acc.deposit(10.0);
		}

		for(Account acc : list){
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}

	}
}

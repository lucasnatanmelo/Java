package entities;

import exceptions.BusinessException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return this.holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return this.balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return this.withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.validateWithdraw(amount);
		this.balance -= amount;
	}
	
	// Method to validate account withdraw when user does an operation 
	private void validateWithdraw(double amount) {
		if (amount > getWithdrawLimit()) {
			throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
		} 
		if (amount > getBalance()) {
			throw new BusinessException("Erro de saque: Saldo insuficiente");
		}
	}
}

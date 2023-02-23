package entities;

// final -> Impede que a classe seja herdada
public final class SavingsAccount extends Account{
	
	private Double interestRate;
	
	public SavingsAccount() {
		
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		this.balance += this.balance * this.interestRate; 
	}
	
	// Override sobrepoe o método de Account
	// final impede que o método seja sobrescrito por outra classe caso seja herdado
	@Override
	public final void withdraw(double amount) {
		this.balance -= amount + 5.0;
	}
}

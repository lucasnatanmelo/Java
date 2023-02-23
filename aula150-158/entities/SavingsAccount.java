package entities;

public class SavingsAccount extends Account{
	private Double interestRate;
	
	public SavingsAccount() {
		
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		// interest Rate = taxa de juro
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
}

package entities;

// final -> Impede que a classe seja herdada
public final class BusinessAccount extends Account{
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return this.loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		this.balance += amount - 10.0;
	}
	
	@Override
	public void withdraw(double amount) {
		// Aproveita a lógica de withdraw da Account 
		super.withdraw(amount);
		balance -= 2.0;		
	}
}

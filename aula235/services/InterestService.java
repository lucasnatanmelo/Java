package services;

import java.security.InvalidParameterException;

// Interface with default methods

public interface InterestService {

	double getInterestRate();

	// This method will be available to all others interfaces that implements this class
	// In this example, Brazil and Usa Interests Services can implement it
	
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}

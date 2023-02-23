package services;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		
		double basicQuota = contract.getTotalValue() / months;
        
		for (int i = 1; i <= months; i++) {

						// get date and add months 
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            
						// get Installments and add in the installments list
						// Note: Notice it's not used a "setInstallments" method in Contract class
            contract.getInstallments().add(new Installment(dueDate, quota));
            
        }
	}
}

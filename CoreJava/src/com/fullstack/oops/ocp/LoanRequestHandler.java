package com.fullstack.oops.ocp;

public class LoanRequestHandler {
	
	private double accountBalance;

	public LoanRequestHandler(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void approveLoan(LoanValidator loanValidator) {
		
		boolean loanCanbepassed=loanValidator.isValid(accountBalance);
		if(loanCanbepassed)
			System.out.println("Loan is approved");
			else
				System.out.println("Loan cannot be approved");
		
	}
	
	

}

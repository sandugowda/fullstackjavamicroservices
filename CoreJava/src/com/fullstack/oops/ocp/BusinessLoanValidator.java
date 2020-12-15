package com.fullstack.oops.ocp;

public class BusinessLoanValidator implements LoanValidator {

	@Override
	public boolean isValid(double balance) {
		// TODO Auto-generated method stub
		if(balance> 10000.00)
		return true;
		
		return false;
	}

}

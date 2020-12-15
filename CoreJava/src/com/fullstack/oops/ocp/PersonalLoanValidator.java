package com.fullstack.oops.ocp;

public class PersonalLoanValidator implements LoanValidator {

	@Override
	public boolean isValid(double balance) {
		// TODO Auto-generated method stub
		if(balance> 5000.00)
		return true;
		
		return false;
	}

}

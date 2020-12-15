package com.fullstack.oops.ocp;

import com.fullstack.oops.srp.personnel.Employee;

public class InternTaxCalculator implements TaxCalculator {

	
	private final int INCOME_TAX_PERCENTAGE =16;
	
	
	

	@Override
	public double calculateTax(Employee employee) {
		// TODO Auto-generated method stub
		
		if(employee.getMonthlyIncome() < 350) {
			return 0;
		}
		return (employee.getMonthlyIncome()*INCOME_TAX_PERCENTAGE)/100;
	}


}

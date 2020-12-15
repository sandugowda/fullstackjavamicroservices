package com.fullstack.oops.ocp;

import com.fullstack.oops.srp.personnel.Employee;

public class PartTimeEmployeeTaxCalculator implements TaxCalculator {


	private final int RETIREMENT_TAX_PERCENTAGE = 5;
	private final int INCOME_TAX_PERCENTAGE =16;
	private final int BASE_HEALTH_INSURANCE = 100;
	
	

	@Override
	public double calculateTax(Employee employee) {
		// TODO Auto-generated method stub
		return BASE_HEALTH_INSURANCE+(employee.getMonthlyIncome()*RETIREMENT_TAX_PERCENTAGE)/100+
				(employee.getMonthlyIncome()*INCOME_TAX_PERCENTAGE)/100;
	}


}

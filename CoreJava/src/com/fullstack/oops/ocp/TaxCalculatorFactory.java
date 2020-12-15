package com.fullstack.oops.ocp;

import com.fullstack.oops.srp.personnel.Employee;
import com.fullstack.oops.srp.personnel.FulltimeEmployee;
import com.fullstack.oops.srp.personnel.Intern;
import com.fullstack.oops.srp.personnel.PartTimeEmployee;

public class TaxCalculatorFactory {
	
	public static TaxCalculator create(Employee employee) {
		
		if(employee instanceof FulltimeEmployee) {
			return new FullTimeEmployeeTaxCalculator();
			
		}
		
		if(employee instanceof PartTimeEmployee) {
			return new PartTimeEmployeeTaxCalculator();
			
		}
		if(employee instanceof Intern) {
			return new InternTaxCalculator();
			
		}
		throw new RuntimeException("Invalid Employee type");
	}

}

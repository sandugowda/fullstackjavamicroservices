package com.fullstack.oops.srp.personnel;

public class PartTimeEmployee extends Employee {

	public PartTimeEmployee(String fullName, double monthlyIncome) {
		super(fullName, monthlyIncome);
		// TODO Auto-generated constructor stub
		
		this.setNbHoursPerWeek(20);
	}

}

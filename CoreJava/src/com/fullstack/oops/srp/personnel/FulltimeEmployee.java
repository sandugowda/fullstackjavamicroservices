package com.fullstack.oops.srp.personnel;

public class FulltimeEmployee extends Employee {

	public FulltimeEmployee(String fullName, double monthlyIncome) {
		super(fullName, monthlyIncome);
		// TODO Auto-generated constructor stub
		
		this.setNbHoursPerWeek(40);
	}

}

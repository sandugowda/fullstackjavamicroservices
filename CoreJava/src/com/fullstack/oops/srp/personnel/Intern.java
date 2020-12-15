package com.fullstack.oops.srp.personnel;

public class Intern extends Employee {

	public Intern(String fullName, double monthlyIncome,int nbHours) {
		super(fullName, monthlyIncome);
		// TODO Auto-generated constructor stub
		
		this.setNbHoursPerWeek(nbHours);
	}

}

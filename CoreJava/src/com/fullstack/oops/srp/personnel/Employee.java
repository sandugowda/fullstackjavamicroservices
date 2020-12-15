package com.fullstack.oops.srp.personnel;

public abstract class Employee extends Object{
	private String firstName,lastName;
	private double monthlyIncome,nbHoursPerWeek;
	
	public Employee(String fullName, double monthlyIncome) {
		setMonthlyIncome(monthlyIncome);
		String [] names= fullName.split(" ");
		
		this.firstName = names[0];
		this.lastName = names[1];
		//this.monthlyIncome = monthlyIncome;
	}
	
	public String getEmail() {
		return this.firstName+"."+this.lastName+"@abc.com";
	}

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		if(monthlyIncome < 0) {
			throw new IllegalArgumentException("Income must be positive");
		}
		
		this.monthlyIncome = monthlyIncome;
	}

	public double getNbHoursPerWeek() {
		return nbHoursPerWeek;
	}

	public void setNbHoursPerWeek(double nbHoursPerWeek) {
		if(nbHoursPerWeek <= 0) {
			throw new IllegalArgumentException("No Of Hours must be positive");
		}
		this.nbHoursPerWeek = nbHoursPerWeek;
	}
	
	
	public String getFullName() {
		return this.firstName+" "+this.lastName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", monthlyIncome=");
		builder.append(monthlyIncome);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	

}

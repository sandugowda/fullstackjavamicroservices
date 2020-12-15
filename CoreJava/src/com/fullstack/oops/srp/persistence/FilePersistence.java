package com.fullstack.oops.srp.persistence;

import com.fullstack.oops.srp.personnel.Employee;

public class FilePersistence {
	
	public String persist(Employee employee) {
		StringBuilder sb = new StringBuilder();
		sb.append("$$$$EMPLOYEE RECORD$$$$$");
		
		sb.append(System.lineSeparator());
		sb.append("NAME:");
		sb.append(employee.getFullName());
		
		sb.append(System.lineSeparator());
		sb.append("Email:");
		sb.append(employee.getEmail());
		
		sb.append(System.lineSeparator());
		sb.append("MONTHLY WAGE:");
		sb.append(employee.getMonthlyIncome());
		return sb.toString();
	}

}

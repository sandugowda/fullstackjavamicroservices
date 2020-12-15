package com.fullstack.oops.isp;

import java.time.Month;

import com.fullstack.oops.srp.personnel.Employee;

public class Payslip implements ExportableText {

	private String employeeName;
	private double monthlyIncome;
	private Month month;
	
	
	public Payslip(Employee employee,Month month) {
		this.employeeName = employee.getFullName();
		this.monthlyIncome = employee.getMonthlyIncome();
		this.month = month;
	}
	
	
	
	
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Payslip [employeeName=");
//		builder.append(employeeName);
//		builder.append(", monthlyIncome=");
//		builder.append(monthlyIncome);
//		builder.append(", month=");
//		builder.append(month);
//		builder.append("]");
//		return builder.toString();
//	}




	@Override
	public String toTxt() {
		StringBuilder builder = new StringBuilder();
		builder.append("Payslip [employeeName=");
		builder.append(employeeName);
		builder.append(", monthlyIncome=");
		builder.append(monthlyIncome);
		builder.append(", month=");
		builder.append(month);
		builder.append("]");
		return builder.toString();
	}


//	@Override
//	public byte[] toPdf() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
}

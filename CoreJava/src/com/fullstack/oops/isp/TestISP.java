package com.fullstack.oops.isp;

import java.time.Month;

import com.fullstack.oops.ocp.TaxCalculator;
import com.fullstack.oops.ocp.TaxCalculatorFactory;
import com.fullstack.oops.srp.logging.ConsoleLogger;
import com.fullstack.oops.srp.persistence.EmployeeRepository;
import com.fullstack.oops.srp.persistence.FilePersistence;
import com.fullstack.oops.srp.personnel.Employee;

public class TestISP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ConsoleLogger consoleLogger = new ConsoleLogger();
		
		FilePersistence persistence = new FilePersistence();
		
		EmployeeRepository repository = new EmployeeRepository(persistence);
		
		Employee [] employees=repository.findAll();
		
		// employees[FullTimeEmployee,PartTimeEmployee,Intern]
		
		
		
		
		// for(int i=0i<employees.length;i++){}

		for(Employee employee : employees) {
			
			Payslip payslip = new Payslip(employee,Month.DECEMBER);
			String exportableText = payslip.toTxt();
			consoleLogger.writeInfo(exportableText);
			// Factory Class with a factory method
			TaxCalculator taxCalculator=TaxCalculatorFactory.create(employee);
			double tax=taxCalculator.calculateTax(employee);
			
			
			try {
				repository.save(employee);
				consoleLogger.writeInfo(employee.getFullName()+ " Total Tax For The Year = "+tax);
				
				consoleLogger.writeInfo("SavedEmployee "+employee);
			}catch(Exception exception) {
				consoleLogger.writeError("Error Saving Employee",exception);
				
			}
		}



	}

}

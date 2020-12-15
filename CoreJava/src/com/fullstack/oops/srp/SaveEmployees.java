package com.fullstack.oops.srp;

import com.fullstack.oops.srp.logging.ConsoleLogger;
import com.fullstack.oops.srp.persistence.EmployeeRepository;
import com.fullstack.oops.srp.persistence.FilePersistence;
import com.fullstack.oops.srp.personnel.Employee;

public class SaveEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConsoleLogger consoleLogger = new ConsoleLogger();
		
		FilePersistence persistence = new FilePersistence();
		
		EmployeeRepository repository = new EmployeeRepository(persistence);
		
		Employee [] employees=repository.findAll();
		
		// for(int i=0i<employees.length;i++){}

		for(Employee e : employees) {
			
			try {
				repository.save(e);
				
				consoleLogger.writeInfo("SavedEmployee "+e);
			}catch(Exception exception) {
				consoleLogger.writeError("Error Saving Employee",exception);
				
			}
		}
		

	}

}

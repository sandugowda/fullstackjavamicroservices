package com.fullstack.oops.srp.persistence;

import com.fullstack.oops.srp.personnel.Employee;
import com.fullstack.oops.srp.personnel.FulltimeEmployee;
import com.fullstack.oops.srp.personnel.PartTimeEmployee;
import com.fullstack.oops.srp.personnel.Subcontractor;

public class EmployeeRepository {
	
	private FilePersistence persistence;
	
	public EmployeeRepository(FilePersistence persistence) {
		this.persistence = persistence;
	}

	public Employee[] findAll() {
		
//		Employee employees[] =  new Employee[4];
//		employees[0]= new FulltimeEmployee("Sachin Tendulkar",2000);
//		employees[1]= new FulltimeEmployee("Sachin Tendulkar",2000);
//		employees[2]= new PartTimeEmployee("Rohit Sharma",1900);
//		employees[3]= new PartTimeEmployee("Jasprit Bumrah",1600);
//		
		
		Employee employees[] = {
				
				new FulltimeEmployee("Sachin Tendulkar",2000),
				new FulltimeEmployee("Virat Kohli",1940),
				new PartTimeEmployee("Rohit Sharma",1900),
				new PartTimeEmployee("Jasprit Bumrah",1600),
				
		};
		return employees;
	}
	
	
	public Subcontractor[] findAllContractors() {
		return new Subcontractor[] {new Subcontractor("ms dhoni",3000,15),
				new Subcontractor("suresh raina",3000,15)};
		
	}
	
	public void save(Employee employee) {
		System.out.println(persistence.persist(employee));
		
	}

}

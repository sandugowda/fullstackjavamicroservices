package com.fullstack.oops.liskov;

import com.fullstack.oops.srp.persistence.EmployeeRepository;
import com.fullstack.oops.srp.persistence.FilePersistence;
import com.fullstack.oops.srp.personnel.ServiceLicenseAgreement;
import com.fullstack.oops.srp.personnel.Subcontractor;

public class ApproveSLA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minTimeOffPercent = 98;
		int maxResolutionDays =2;
		
		ServiceLicenseAgreement sla = new ServiceLicenseAgreement(minTimeOffPercent,
				maxResolutionDays);
		FilePersistence persistence = new FilePersistence();
		EmployeeRepository repository = new EmployeeRepository(persistence);
		Subcontractor contractors[]=repository.findAllContractors();
		
		for(Subcontractor contractor:contractors)
			System.out.println(contractor+" "+contractor.approveSLA(sla));
		// Get Contractors 
		

	}

}


abstract class Bird{
	
	abstract void fly();
	
	
}


class Ostrich extends Bird{
	void fly() {}
	
}
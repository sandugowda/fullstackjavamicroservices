package com.fullstack.oops.ocp;

public class TestOCP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoanValidator personalLoan = new PersonalLoanValidator();
		
		LoanValidator businessLoan = new BusinessLoanValidator();
		
		LoanRequestHandler loanRequestHandler = new LoanRequestHandler(4000.00);
		loanRequestHandler.approveLoan(personalLoan);
		

		
		LoanRequestHandler loanRequestHandler1 = new LoanRequestHandler(19000.00);
		loanRequestHandler1.approveLoan(businessLoan);
		
	}

}

// S -> SRP -> Every Function,class, module should have one and only one reason to change


// UserInterfaces
// BusinessLogic
// Persistence
// Logging
// PersonalizationForUsers

// makes code easier to understand , fix & maintain


// reduce coupling between the classes & resilient to changes

// More Testable Design

// Methods() 

// Income getIncome(Employee e){

// Income income=dao.getIncome(e.id)

// Payslip payslip=PayslipGenerator.get(income)


// EmailService.send(e.email,payslip)

// return income 
//}



















package com.encapsulation;

public class LoanApplicationMain {

	public static void main(String[] args) {
		
		LoanApplication loan=new LoanApplication("Bhargavi",30000.00,2.5,5,30000);
		System.out.println("\n");
		System.out.println("Name:" +loan.getCustomerName());
		System.out.println("Loan Amount:" +loan.getLoanAmount());
		System.out.println("Interest Rate:" +loan.getInterestRate());
		System.out.println("Loam Term:" +loan.getLoanTerm());
		System.out.println("outstanding balance:" +loan.getOutstandingBalance());
		System.out.println("\n");
		System.out.println("After name updated");
		loan.setCustomerName("Thanmai");
		loan.getCustomerName();
		loan.makePayment(0);
		System.out.println(loan);
		loan.makePayment(500000);
		System.out.println(loan);
		System.out.println("\n");
		System.out.println("After pay outstandingbalance");
		loan.makePayment(2421);
		System.out.println(loan);
		loan.makePayment(5000);
		System.out.println("Balance:"+loan.getOutstandingBalance());
		System.out.println("\n");
		loan.calculateEMI();	
	}

}

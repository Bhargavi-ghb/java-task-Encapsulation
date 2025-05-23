package com.encapsulation;

public class LoanApplication {

	private String customerName;
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double outstandingBalance;
	
	
	public LoanApplication(String customerName,double loanAmount,double interestRate,int loanTerm,double outstandingBalance) {
		this.customerName=customerName;
		this.loanAmount=loanAmount;
		this.interestRate=interestRate;
		this.loanTerm=loanTerm;
		this.outstandingBalance=outstandingBalance;
		System.out.println("Loan Application submitted");
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanAmount(double loanAmount) {
		this.loanAmount=loanAmount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm=loanTerm;
	}
	public double getOutstandingBalance() {
		return outstandingBalance;
	}
	
	public void setOutstandingBalance(double outstandingBalance) {
		this.outstandingBalance=outstandingBalance;
	}
	
	public void makePayment(double amount) {
		if(amount<=0) {
			System.out.println("invalid amount");
		}
		else if(amount>outstandingBalance){
			System.out.println("exceeds the outstandingbalance");
		}
		else {
			outstandingBalance=outstandingBalance-amount;
		}
	}
	
	public void calculateEMI() {
		 double monthlyInterestRate=(this.interestRate/(12*100));
		 int monthlyLoarnTerm=this.loanTerm*12;
		 System.out.println( "monthlyInterestRate :"+ monthlyInterestRate);
		 System.out.println( "monthlyLoarnTerm : "+ monthlyLoarnTerm);
		 double emi=(this.loanAmount*monthlyInterestRate*(Math.pow(1+monthlyInterestRate,monthlyLoarnTerm))/(Math.pow(1+monthlyInterestRate, monthlyLoarnTerm)-1));
		 System.out.println("Emi :"+emi);
	}

	public String toString() {
		return "customerName=" + customerName + ", loanAmount=" + loanAmount + ", interestRate="
				+ interestRate + ", loanTerm=" + loanTerm + ", outstandingBalance=" + outstandingBalance ;
	}
	
	
}

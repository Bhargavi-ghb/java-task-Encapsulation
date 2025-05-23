package com.encapsulation;

public class CreditCardAccount {

	private String customerName;
	private double creditLimit;
	private double currentDebt;
	private double interestRate;
	public CreditCardAccount(String customerName, double creditLimit, double currentDebt, double interestRate) {
		super();
		this.customerName = customerName;
		this.creditLimit = creditLimit;
		this.currentDebt = currentDebt;
		this.interestRate = interestRate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public double getCurrentDebt() {
		return currentDebt;
	}
	public void setCurrentDebt(double currentDebt) {
		this.currentDebt = currentDebt;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void swipeCard(double amount) {
		if(amount>this.currentDebt) {
			System.out.println("Transcation declined: Limit exceeded");
		}
		else {
			this.currentDebt=this.currentDebt+amount;
			System.out.println("currentDebt :" +this.currentDebt);
		}
	}
	
	public void makePayment(double amount){
		if(amount<this.currentDebt) {
			this.currentDebt=this.currentDebt-amount;
			System.out.println("After payment :"+currentDebt);
		}
		else {
			System.out.println("Exceeds payment not allowed");
		}
	}
	
	public void applyInterest() {
		double interest=(currentDebt*interestRate)/100;
		System.out.println(interest);
		
	}

	public String toString() {
		return "customerName=" + customerName + ", creditLimit=" + creditLimit + ", currentDebt="
				+ currentDebt + ", interestRate=" + interestRate ;
	}
	
	
}

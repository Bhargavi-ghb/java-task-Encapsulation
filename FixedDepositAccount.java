package com.encapsulation;

public class FixedDepositAccount {

	private String customerName;
	private double principalAmount;
	private double interestRate;
	private int duration;
	private double maturityAmount;
	
	public FixedDepositAccount(String customerName,double principalAmount ,double interestRate ,int duration ,double maturityAmount){
		this.customerName =customerName ;
		this.principalAmount=principalAmount;
		this.interestRate=interestRate;
		this.duration=duration;
		this.maturityAmount=maturityAmount;
		
		System.out.println("Fixed Depoist created sucessfully");
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	
	public double getPrincipalAmount(){
		return principalAmount;
	}
	
	public void setPrincipalAmount(double principalAmount){
		this.principalAmount=principalAmount;
	}
	
	public double getInterestRate(){
		return interestRate;
	}
	
	public void setInterestRate(int interestRate){
		this.interestRate=interestRate;
	}
	
	public int getDuration(){
		return duration;
	}
	
	public void setDuration(int duration){
		this.duration=duration;
	}
	
	public double getMaturityAmount(){
		return maturityAmount;
	}
	
	public void setMaturityAmount(double maturityAmount){
		this.maturityAmount=maturityAmount;
	}
	
	
	public void calculateMaturityAmount(){
		double monthlyRate = interestRate / 12 / 100;
		this.maturityAmount=this.principalAmount*(Math.pow(1+monthlyRate,duration*12));
		System.out.println("compount interest :" +maturityAmount);
	}
	
	public void withdrawBeforeMaturity(int maturity) {
		if(maturity<12) {
			System.out.println("cannot withdraw before one year");
		}
		else {
			if(maturity<this.duration*12) {
				double penatly=this.principalAmount*0.02;
				double withdrawl=this.maturityAmount-penatly;
				System.out.println("withdrawl amount after penalty :"+withdrawl);	
			}
			else {
				System.out.println("withdrawl amount withdrawl penalty :"+this.maturityAmount);	
			}
		}
	}

	public String toString() {
		return "customerName=" + customerName + ", principalAmount=" + principalAmount
				+ ", interestRate=" + interestRate + ", duration=" + duration + ", maturityAmount=" + maturityAmount;
	}
	
	
	
	
	
	
	
	
	
}

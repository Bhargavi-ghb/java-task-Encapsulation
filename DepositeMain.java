package com.encapsulation;

public class DepositeMain {

	public static void main(String[] args) {
		
		FixedDepositAccount loan=new FixedDepositAccount("Bhargavi",100000,5.0,3,0);
		System.out.println(loan);
		loan.calculateMaturityAmount();
		loan.withdrawBeforeMaturity(38);
		
	
	}
}

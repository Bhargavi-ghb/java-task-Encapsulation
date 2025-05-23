package com.encapsulation;

public class CreditCardMain {

	public static void main(String[] args) {
		CreditCardAccount credit=new CreditCardAccount("Bhargavi",100000.0,2000.78,2);
		System.out.println(credit);
		credit.swipeCard(1001);
		credit.makePayment(1000);
		credit.applyInterest();
	}

}

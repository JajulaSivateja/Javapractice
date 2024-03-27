package com.DebitCard;

import com.Payment.Payment;

public class Debitcard implements Payment{
	
	double cardnum ;
	double expdate;
	double cvv ;
	
	public void debit() {
		System.out.println("card number = "+987654321);
		System.out.println("exp date = "+12/23);
		System.out.println("cvv = "+987);
	}
	
	@Override
	public void makePayment(double amount) {
		System.out.println("Payment of " + amount + " made using debit Card.");
	}

}

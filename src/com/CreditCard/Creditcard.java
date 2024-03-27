package com.CreditCard;

import com.Payment.Payment;

public class Creditcard implements Payment {
	
	private double cardnum ;
	private double expdate;
	 double cvv ;
	
	public void credit() {
		System.out.println("card number = "+1234567890);
		System.out.println("exp date = "+12/23);
		System.out.println("cvv = "+123);
	}
	@Override
	public void makePayment(double amount) {
		System.out.println("Payment of " + amount + " made using Credit Card.");
		}

}

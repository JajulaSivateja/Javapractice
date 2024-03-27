package com.Cashondelivery;

import com.Payment.Payment;

public class Cashondel implements Payment {

	@Override
	public void makePayment(double amount) {
		System.out.println("Payment of " + amount + " made using Cash on Delivery.");
		
	}

}

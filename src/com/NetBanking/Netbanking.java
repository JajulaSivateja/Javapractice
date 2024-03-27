package com.NetBanking;

import com.Payment.Payment;

public class Netbanking implements Payment {
	
	private String username = "abcdefghi";
	private String password = "123456";
	
		public void netbanking() {  
		System.out.println("Username = "+"abcdefghi");
		System.out.println("password = "+"123456");
		}
		@Override
		public void makePayment(double amount) {
			System.out.println("Payment of " + amount + " made using Net Banking.");
	}

}

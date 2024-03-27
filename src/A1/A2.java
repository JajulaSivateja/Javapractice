package A1;

import com.Payment.Payment;
import com.Cashondelivery.Cashondel;
import com.CreditCard.Creditcard;
import com.DebitCard.Debitcard;
import com.NetBanking.Netbanking;

public class A2 {

	public static void main(String[] args) {
		
		Payment pay = new Debitcard();
		pay.makePayment(100);
		
		System.out.println("");
		
		Payment pay1 = new Creditcard();
		pay1.makePayment(130);
		
		System.out.println("");
		
		Payment pay2 = new Netbanking();
		pay2.makePayment(150);
		
		System.out.println("");
		
		Payment pay3 = new Cashondel();	
		pay3.makePayment(200);
	}

}

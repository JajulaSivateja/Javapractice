package A3;

import java.util.Scanner;

import com.Cashondelivery.Cashondel;
import com.CreditCard.Creditcard;
import com.DebitCard.Debitcard;
import com.NetBanking.Netbanking;
import com.Payment.Payment;

public class A4 {

    public static void main(String[] args) {
    	

    	System.out.println("payment method");
    	System.out.println("1.Debit Card");
    	System.out.println("2.Credit Card");
    	System.out.println("3.NetBanking");
    	System.out.println("4.CashOnDelivery");
    	
    	 
    	 Scanner scanner = new Scanner(System.in);
         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
            	 System.out.println("1.Debit Card");
            	 Payment pay = new Debitcard();
                 pay.makePayment(200000);
                 break;
             case 2:
            	 System.out.println("2.Credit Card");
                 Payment pay1 = new Creditcard(); 
                 pay1.makePayment(12000);
                 break;
             case 3:
            	 System.out.println("3.Netbanking");
            	 Payment pay2 = new Netbanking();
                 pay2.makePayment(1300);
                 break;
             case 4:
            	 System.out.println("4.Cash on Delivery");
            	 Payment pay3 = new Cashondel();
                 pay3.makePayment(16000);
                 break;
             default:
                 System.out.println("Invalid choice.............");
                 break;
         }
     }


 }
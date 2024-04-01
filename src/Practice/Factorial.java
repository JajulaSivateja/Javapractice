package Practice;

public class Factorial {

	public static void main(String[] args) {

		int i;
		int fact=1;  
		int number=5; 
		
		for(i=1;i<=number;i++){
			fact=fact*i;    			//5*4*3*2*1=120
	  }    
	 System.out.println("Factorial of "+number+" is: "+fact);    
	 }  
}  

package Practice;

public class Pattern {

	public static void main(String[] args) {
		
		int i, j, row=6;   
		for(i=0; i<row; i++){   
		for(j=0; j<=i; j++){   
		System.out.print("*");   			//Right Triangle Star Pattern
		}   
		System.out.println();   
		}
		
		System.out.println();
//..........................................
		
		int i1, j1, row1 = 6;       
		for (i1=0; i1<row1; i1++){  
		for (j1=2*(row1-i1); j1>=0; j1--){  
		System.out.print(" ");   
		}   
		for (j1=0; j1<=i1; j1++ ){   
		System.out.print("* ");   
		}   
		System.out.println();   
		}
		
		System.out.println();
//..........................................  
		int i2, j2, row2 = 6;       
		for (i2=0; i2<row2; i2++){  
		for (j2=row2-i2; j2>1; j2--){  
		System.out.print(" ");   
		}   
		for (j2=0; j2<=i2; j2++ ){   
		System.out.print("* ");   
		}   
		System.out.println();   
		} 
		
		System.out.println();
//...........................................		  
		
		

	
	
	
	}   
}



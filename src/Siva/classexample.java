package Siva;

public class classexample {
	
	 int rollno;  
	 String name;
	 
	 void insert(int r, String n){  
	  rollno=r;  
	  name=n;  
	 }  
	 void displayInf(){
		 System.out.println(rollno+" "+name);
	 }   
	 
	 public static void main(String args[]){  
		 classexample s1=new classexample();  
		 classexample s2=new classexample();  
	  s1.insert(111,"Siva");  
	  s2.insert(222,"Teja");  
	  s1.displayInf();  
	  s2.displayInf();    
	 }
}
package Siva;

public class Shape1 {
	 float dim1,dim2;
	  float area;
	  
	  void areaOfShape(String shapeName, float dim1, float dim2){
	  
	    switch(shapeName){
	      
	       case "circle":
	          float pi = 3.14f;
	          area = pi * dim1 * dim1 ;
	          System.out.println("area of circle : "+area);
	          break;
	      case "rectangle":
	          area = dim1*dim2;
	          System.out.println("area of rectangle:"+area);
	          break;
	        
	      default:
	         System.out.println("none........");    
	      
	    }  
	    
	  }
	  
	   public static void main(String args[]){ 
	     Shape1 shape = new Shape1();
	     shape.areaOfShape("circle",33.3f,0.0f);
	     shape.areaOfShape("rectangle",33.3f,12.0f);
	   }
	 }


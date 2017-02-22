public class STUDENTADVANCECLASS extends ADVANCECLASS  
 { 
 	public STUDENTADVANCECLASS() 
 	{ 
 		super(); 
 	} 
 	 
 	public double getPrice() 
 	{ 
 		return super.getPrice()/2;  
 	} 
 	 
	 
	 
 	public String toString() 
 	{ 
 		return "Serial #: " + getSerialNo() + "\n" 
 			  + "Price: " + getPrice() + "\n"  
 			  + "(STUDENT ID REQUIRED!!!)"; 
 	} 
 }


 

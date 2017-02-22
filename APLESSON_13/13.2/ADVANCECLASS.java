public class ADVANCECLASS extends TICKETSUPERCLASS 
 { 
 	private int daysLeft; 
 	 
 	public ADVANCECLASS() 
 	{ 
 		super(); 
 		this.daysLeft = 0; 
 	} 
 	 
 	public ADVANCECLASS(int d) 
 	{ 
 		super(); 
 		this.daysLeft = d; 
 		 
 	} 
 	 
	 
	 
 	public double getPrice() 
 	{ 
 		if(daysLeft >= 10) 
 			return 30.00; 
 		else 
 			return 40; 
 	} 
 }



 

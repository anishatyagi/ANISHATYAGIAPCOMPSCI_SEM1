import static java.lang.Math.*; 
 public class EX01MILESPERHOUR
 { 
 	private int distance, hours, minutes; 
 	private double mph; 
 	 
 	public EX01MILESPERHOUR() 
 	{  
 		distance = 0; 
 		hours = 0; 
 		minutes = 0; 
 		mph = 0; 
 	} 
 	 
	 
 	public EX01MILESPERHOUR(int d, int h, int m) 
 	{ 
 		distance = d; 
 		hours = h; 
 		minutes = m; 
 		mph = 0;  
 	} 
 	 
	 
 	
 	public void setDistance(int d) 
 	{ 
 		distance = d; 
 	} 
 	 
 	public void setHours(int h) 
 	{ 
 		hours = h; 
 	} 
 	 
 	public void setMinutes(int m) 
 	{ 
 		minutes = m; 
 	} 
 	public double getMPH() 
 	{ 
 		mph = Math.round(distance / (hours + minutes / 60.0)); 
 		return mph; 
 	} 
 } 


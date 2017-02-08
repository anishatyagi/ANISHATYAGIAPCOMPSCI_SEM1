public class THEAFIGURECLASS extends THETOYCLASS  
 { 
 	private String THEAFIGURECLASS;  
 
 
 
 
 	public THEAFIGURECLASS() 
 	{ 
 		super(); 
 		THEAFIGURECLASS = ""; 
 	} 
 	 
 	public THEAFIGURECLASS(String n, String af) 
 	{ 
 		super(n); 
 		THEAFIGURECLASS = af; 
 	} 
 	 
 	public String getType() 
 	{ 
 		return THEAFIGURECLASS;  
 	} 
 	 
 	public String toString() 
 	{ 
 		return "Action Figure: " + THEAFIGURECLASS + "\n" + 
 				super.toString(); 
 	} 
 }


 

public class THECARCLASS extends THETOYCLASS 
 { 
 
 
 	private String name, THECARCLASS; 
 	 
 	public THECARCLASS() 
 	{ 
 		super(); 
 		this.THECARCLASS = ""; 
 	} 
 	 
 	public THECARCLASS(String n, String c) 
 	{ 
 		super(n); 
 		this.THECARCLASS = c; 
 	} 
 	 
 	public String toString() 
 	{ 
 		return "THECARCLASS:" + THECARCLASS + "\n" + 
 				super.toString(); 
 	} 
 	 
 	public String getType() 
 	{ 
 		return THECARCLASS; 
 	} 
 } 
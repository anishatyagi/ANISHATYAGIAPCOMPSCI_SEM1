public abstract class THETOYCLASS  
 { 
 	private String name; 
 	private int count; 
 
 
 	public THETOYCLASS() 
 	{ 
 		this.name = ""; 
 		this.count = 1; 
 	} 
 	public THETOYCLASS(String n) 
 	{ 
 		this.name = n; 
 		this.count = 1; 
 	} 
 	public String getName() 
 	{ 
 		return name; 
 	} 
 	public int getCount() 
 	{ 
 		return count; 
 	} 
 	public void setName(String n) 
 	{ 
 		this.name = n; 
 	} 
 	public void setCount(int c) 
 	{ 
 		this.count = c; 
 	} 
 	public abstract String getType(); 
 	 
 	public String toString() 
 	{ 
 		return "There are " + count + " of" + name + " in the system.\n" ; 
 	} 
 	 
 }
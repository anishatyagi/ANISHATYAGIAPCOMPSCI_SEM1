public abstract class CONSOLECLASS extends GAMESYSTEMSCLASS 
 { 
 	public abstract String getController(); 
 	 
 	public CONSOLECLASS() 
 	{ 
 		super(); 
 	} 
 	 
 	public CONSOLECLASS(String c) 
 	{ 
 		super(c); 
 	} 
 	 
	 
	 
 	public String toString() 
 	{ 
 		return "Platform: " + getPlatform() + "\n" 
 			  + "Serial #: " + getSerialNo() + "\n" 
 			  + "Controller: " + getController();   
 	} 
 	 
 }

 

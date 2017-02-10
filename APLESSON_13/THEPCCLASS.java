
public abstract class THEPCCLASS extends GAMESYSTEMSCLASS 
 { 
 	public THEPCCLASS() 
 	{ 
 		super(); 
 	} 
 	 
 	public THEPCCLASS(String c) 
 	{ 
 		super(c); 
 	} 
 	 
 	public String systemInput() 
 	{ 
 		return "Keyboard and Mouse"; 
 	} 
 	 
 	public String toString() 
 	{ 
 		return "Platform: " + getPlatform() + "\n" 
 			  + "Serial #: " + getSerialNo() + "\n" 
 			  + "System Input: " + systemInput();   
 	} 
 	 
 } 

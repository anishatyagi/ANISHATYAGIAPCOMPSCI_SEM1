public abstract class GAMESYSTEMSCLASS
 { 
 	private String platform; 
 	private int serialNo; 
    public GAMESYSTEMSCLASS() 
 	{ 
 		this.platform = ""; 
 		this.serialNo = 0; 
 	} 
 	 
 	public GAMESYSTEMSCLASS(String p) 
 	{ 
 		this.platform = p; 
 		this.serialNo = 1234567; 
 	} 
 	 
 	public String getPlatform() 
 	{ 
 		return platform; 
 	} 
 	 
 	
	
	public int getSerialNo() 
 	{ 
 		return serialNo; 
 	} 
 	 
 }
 

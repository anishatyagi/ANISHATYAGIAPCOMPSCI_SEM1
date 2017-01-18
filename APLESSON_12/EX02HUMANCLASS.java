public class EX02HUMANCLASS 
 { 
 	private String hair, eyes, skin; 
 
 
 	public EX02HUMANCLASS () 
 	{ 
 		hair = ""; 
 		eyes = ""; 
 		skin = ""; 
 	} 
 	 
 	public EX02HUMANCLASS (String h, String e, String s) 
 	{ 
 		hair = h; 
 		eyes = e; 
 		skin = s; 
 	} 
 	 
 
 	public void setHES(String h, String e, String s) 
 	{ 
 		hair = h; 
 		eyes = e; 
 		skin = s; 
 	} 
 	 
 	
 	public String getHair() 
 	{ 
 		return hair; 
 	} 
 	 
 	public String getEyes() 
 	{ 
 		return eyes; 
 	} 
 	public String getSkin() 
 	{ 
 		return skin; 
 	} 
 	 
 } 



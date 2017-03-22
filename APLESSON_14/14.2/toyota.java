import java.util.ArrayList; 
 import java.util.Arrays; 
 public class toyota extends car  
 { 
 	private double xCoord; 
 	private double yCoord; 
 	 
  public toyota(String pos)  
 	{ 
  super(); 
  ArrayList<String> position = new ArrayList<>(Arrays.asList(pos.split(", "))); 
  Double posX = Double.parseDouble(position.get(0)); 
 	Double posY = Double.parseDouble(position.get(1)); 
  move(posX, posY); 
  } 
 	 
 } 

import java.util.ArrayList; 
 import java.util.Arrays; 
 public class SATELLITE  
 { 
  public static void main(String[]args)  
 	{ 
  ArrayList<Car> locate = new ArrayList<>(); 
  double[] position = new double[6]; 
   
 	for(int i = 0; i < 6; i++)  
 	{ 
  position[i] = Math.round((double)(Math.random() * 100) + 1); 
  } 
   
 	double[] hLoc = {5, 6}; 
 	 
  locate.add(new HONDA(hLoc)); 
  locate.add(new TOYOTA("8, 9")); 
  locate.add(new GMC(3, 8)); 
  int i = 0; 
   
 	for(Car l : locate)  
 	{ 
  l.move(position[i], position[i+1]); 
  i += 2; 
  } 
   
 	double[] home = {0, 0}; 
  String printout = "==========================\n" + "\nSTARTING LOCATIONS: "; 
   
 	for(Car l : locate)  
 	{ 
  printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")"; 
  } 
  printout += "\n\n" + "=========================="; 
  i = 0; 
   
 	for(LOCATION l : locate)  
 	{ 
  double one = Math.random() * 99 + 1; 
 	double two = Math.random() * 99 + 1; 
 	((Car)l).move(one, two); 
 	 
 	 
  printout += "\n\nAfter " + l.getID() + " moved (" + one + ", " + two + ")" 
  + "\nNew location: " + "(" + one + ", " + two + ")" + "\n"; 
 	 
  } 
  printout += "\n" + "==========================" + "\nDistance from home!"; 
   
 	for(Car l : locate)  
 	{ 
  printout += "\n\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")"; 
  } 
  System.out.println(printout); 
  } 
 	 
  public static double getDistance(double[] car, double[] home)  
 	{ 
  return Math.round(Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)))); 
  } 
 	 
  public static String getLocation(double[] Loc)  
 	{ 
  return Loc[0] + ", " + Loc[1]; 
  } 
 }
 

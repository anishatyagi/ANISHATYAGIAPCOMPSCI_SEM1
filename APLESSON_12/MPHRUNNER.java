import java.util.Scanner; 
 public class MPHRUNNER
 { 
 	public static void main (String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("Please, enter the distance! "); 
 		int distance = kb.nextInt(); 
 		System.out.println("Please, enter the hours! "); 
 		int hours = kb.nextInt();         
 		System.out.println("Please, enter the minutes! ");      
 		int minutes = kb.nextInt();       
 		 
 		EX01MILESPERHOUR object = new EX01MILESPERHOUR(distance, hours, minutes); 
 		 
 		System.out.println(distance + " miles in " + hours + " hours is " + object.getMPH() + " mph. "); 
 		 
 		object.setDistance(distance); 
 		object.setHours(hours); 
 		object.setMinutes(minutes); 
 		System.out.println(distance + " miles in " + hours + " hours is " + object.getMPH() + " mph. "); 
 		 
 		 
 	 
 	 
 	 
 	} 
 } 
 



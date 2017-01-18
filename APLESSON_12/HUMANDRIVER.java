import java.util.Scanner; 
 public class HUMANDRIVER
 { 
 	public static void main (String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("Please, enter the hair color! "); 
 		String hair = kb.next(); 
 		kb.nextLine(); 
 		System.out.println("Please, enter the eye color! "); 
 		String eyes = kb.next();  
 		kb.nextLine(); 
 		System.out.println("Please, enter the skin color! "); 
 		String skin = kb.next(); 
 		kb.nextLine(); 
 		 
 		EX02HUMANCLASS  object = new EX02HUMANCLASS (hair, eyes, skin); 
 		System.out.println("My information!"); 
 		System.out.println("Hair: " + object.getHair()); 
 		System.out.println("Eyes: " + object.getEyes()); 
 		System.out.println("Skin: "  + object.getSkin()); 
 		 
 		object.setHES("black", "dark brown", "tan"); 
 		System.out.println("Friend's information!"); 
 		System.out.println("Hair: " + object.getHair()); 
 		System.out.println("Eyes: " + object.getEyes()); 
 		System.out.println("Skin: "  + object.getSkin()); 
 	} 
 }

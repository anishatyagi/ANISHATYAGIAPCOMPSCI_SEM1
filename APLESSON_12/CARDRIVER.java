import java.util.Scanner; 
 public class CARDRIVER
 { 
 	public static void main(String[]args) 
 	{ 
 		String p = ""; 
 		String i = ""; 
 		String e = ""; 
 		String t = ""; 
 		 
 		Scanner kb = new Scanner(System.in); 
 		 
 		System.out.println("Please, enter the paint color! "); 
 		p = kb.nextLine(); 
 		System.out.println("Please, enter the interior type! "); 
 		i = kb.nextLine(); 
 		System.out.println("Please, enter the engine type! "); 
 		e = kb.nextLine(); 
 		System.out.println("Please, enter the tire types: "); 
 		t = kb.nextLine(); 
 		 
 		EX03CARCLASS object = new EX03CARCLASS(p, i, e, t); 
 		 
 		System.out.println("Your vehicle is ready!"); 
 		System.out.printf("Paint:\t%s\n", object.getPaint()); 
 		System.out.printf("Interior:\t%s\n", object.getInterior()); 
 		System.out.printf("Engine:\t%s\n", object.getEngine()); 
 		System.out.printf("Tires:\t%s", object.getTires()); 
 	} 
 }

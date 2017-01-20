import java.util.Scanner; 
 public class PUBLICCLASSUSERCLASS
 { 
 	public static void main(String[]args) 
 	{ 
 		String f, l, YorN, a; 
 		 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("Please, enter your first name! "); 
 		f = kb.next(); 
 		System.out.println("Please, enter your last name!  "); 
 		l = kb.next(); 
 		System.out.println("Would you like to use a public avatar?? (y or n): "); 
 		YorN = kb.next(); 
 		 
 		 
 		if(YorN.equals("n")) 
 		{ 
 			EX05USERCLASS object = new EX05USERCLASS(f, l); 
 			System.out.println(object); 
 		} 
 			 
 		else 
 		{ 
 			System.out.println("Please, enter your avatar name! "); 
 			a = kb.next(); 
 			EX05USERCLASS object1 = new EX05USERCLASS(f, l, a); 
 			System.out.println(object1); 
 		} 
 	} 
 } 

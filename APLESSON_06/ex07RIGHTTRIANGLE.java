import java.util.Scanner; 
 public class ex07RIGHTTRIANGLE
 { 
 	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("Please, enter your word! "); 
 		String word = kb.next(); 
 		int length = word.length(); 
 		 
 		
		
		for(int i = length; i >= 0; i--) 
 		{ 
 			System.out.println(word.substring(i)); 
 		} 
 	} 
 } 

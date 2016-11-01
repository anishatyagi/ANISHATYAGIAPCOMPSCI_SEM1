import java.util.Scanner;  
 public class ex03REVERSETRIANGLE
 { 
 	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("Please, enter a word. "); 
 		String word = kb.next(); 
 		int length = word.length(); 
 		 
 		
		
		for(int i = length; i >= 0; i--) 
 		{ 
 			System.out.println(word.substring(0, i)); 
 		} 
 	} 
 } 

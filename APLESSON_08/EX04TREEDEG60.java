import java.util.Scanner; 
 public class EX04TREEDEG60 
 { 
 	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("Please, enter your word! "); 
 		String word = kb.next(); 
 		int start = 1; 
 		int stopp = word.length(); 
 		tree(word, start, stopp); 
 	} 
 	 
 	
	
	public static void tree(String word, int start, int stopp) 
 	{ 
 		if(start <= stopp) 
 		{ 
 			System.out.printf("%10s\n", word.substring(0,start)); 
 			start += 1; 
 			tree(word, start, stopp); 
 		} 
 	} 
 } 


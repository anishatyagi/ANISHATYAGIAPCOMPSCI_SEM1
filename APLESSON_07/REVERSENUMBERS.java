import java.util.Scanner; 
 public class REVERSENUMBERS
 { 
 	static int number; 
 	static int REV = 0; 
 	 
 	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("Please, enter a number! "); 
 		number = kb.nextInt(); 
 		getReverse(); 
 		System.out.println(number + " reversed is " + REV); 
 	} 
 	
	
	public static void getReverse() 
 	{ 
 		int num = number; 
 		while(num>0) 
 		{ 
 			REV *= 10; 
 			REV += num %10; 
 			num /= 10; 
 		} 
 	} 
 } 



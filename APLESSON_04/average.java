
import java.util.Scanner; 
 public class average 
 { 
 	static double num1; 
 	static double num2; 
 	static double num3; 
 	static double average; 
	
	
 	 
 	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("Please enter a number:"); 
 		num1 = kb.nextDouble(); 
 		 
 		System.out.println("Please enter another number:"); 
 		num2 = kb.nextDouble(); 
 		 
 		System.out.println("Please enter another number:"); 
 		num3 = kb.nextDouble(); 
 		average(); 
 		print(); 
 	} 
 	 
 	public static void average()  
 	{ 
 		average = (num1+num2);
	}
	public static void print();
	System.out.printf("The average of "num1"+"num2"+"num3" %f is %.5f.",r,area);
 }
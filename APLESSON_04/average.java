import java.util.Scanner; 
 public class average 
 { 
 	static double numberone; 
 	static double numbertwo; 
 	static double numberthree; 
 	static double average; 
	
	
 	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("Please, enter number 1:"); 
 		numberone = kb.nextDouble(); 
 		System.out.println("Please, enter number 2:"); 
 		numbertwo = kb.nextDouble(); 
 		System.out.println("Please, enter number 3:"); 
 		numberthree = kb.nextDouble(); 
 		 
 		average(); 
 		print(); 
 	} 
 	
	public static void average() 
 	{ 
 		average = (numberone+numbertwo+numberthree)/3; 
 	} 
 	
	
	public static void print() 
 	{ 
 		System.out.printf("The average of "+numberone+", "+numbertwo+", and "+numberthree+" is %.5f !", average); 
 	} 
 } 


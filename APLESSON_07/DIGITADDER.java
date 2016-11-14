import java.util.Scanner; 
 public class DIGITADDER
 { 
 	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("Please, enter an integer value! "); 
 		int number = kb.nextInt(); 
 		int sum = 0; 
 		int num = number; 
 		SUMDigits(sum,num,number); 
 		 
 	} 
 	 
 	
	
	public static void SUMDigits(int sum, int num, int number) 
 	{ 
 		while(num > 0) 
 		{ 
 			sum += (num % 10); 
 			num /= 10; 
 			 
 		} 
 		System.out.println("The sum of all the digits in " + number + " is " + sum); 
 	} 
 } 

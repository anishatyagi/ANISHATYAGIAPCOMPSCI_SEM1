import java.util.Scanner; 
 
 
 public class ex06passwordprog
 { 
 	public static void passCheck(String username,String password) 
 	{ 
 		Scanner sc = new Scanner(System.in); 
 		System.out.print("Enter username: "); 
 		String input1 = sc.next(); 
 		System.out.print("Enter password: "); 
 		String input2 = sc.next(); 
 		if(input1.equals(username) && input2.equals(password)) 
 			System.out.println("You are granted access!"); 
 		else 
 		{ 
 			if(input1.equals(username)) 
 				System.out.println("Your password is incorrect!"); 
 			else if(input2.equals(password)) 
 				System.out.println("Your username is incorrect!"); 
 			else 
 				System.out.println("Sorry, your username and password are incorrect."); 
 			passCheck(username,password); 
 		} 
 	} 
 	
	public static void main(String[]args) 
 	{ 
 		String username = "me"; 
 		String password = "anishatyagi"; 
 		passCheck(username,password); 
 	} 
 } 



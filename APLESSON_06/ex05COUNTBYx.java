import java.util.Scanner; 
public class ex05COUNTBYx
 { 
 	public static void main(String[]args) 
 	{ 
 		
 		Scanner sc = new Scanner(System.in); 
 		System.out.print("Please, enter number to count up to. "); 
 		int numberone = sc.nextInt(); 
 		System.out.print("Please, enter number to count by. "); 
 		int numbertwo = sc.nextInt(); 
 		
		
		
		
		for(int i = numbertwo; i <= numberone; i+= numbertwo) 
 		{ 
 			System.out.print(i+"\t"); 
 		} 
 	} 
 } 

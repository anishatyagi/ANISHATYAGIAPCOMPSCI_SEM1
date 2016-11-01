import java.util.Scanner; 
 public class ex04GRAPHTABLE 
 { 
 	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("Please, enter an integer! "); 
 		int number = kb.nextInt(); 
 		kb.nextLine(); 
 		System.out.println("Please, enter the size you want your table to be! "); 
 		int size = kb.nextInt(); 
 		 
 		
		
		
		for(int i = 1; i <= size; i++) 
 		{ 
 		System.out.printf("%5d  %5d\n",i,(i*number)); 
 		} 
 	} 
 } 





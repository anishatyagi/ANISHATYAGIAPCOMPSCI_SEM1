import java.util.Scanner; 
 public class ex04bmip2
 { 
 	static String condition; 
 	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 	 
 		System.out.println("Please, enter your height in inches: "); 
 		double height = kb.nextInt(); 
 		System.out.println("Please, enter you weight in pounds: "); 
 		double weight = kb.nextInt(); 
 		double BMI = 0; 
 		 
 		calcBMI(height, weight, BMI, condition); 
 	} 
 	 
 	
	
	public static void calcBMI(double height, double weight, double BMI, String condition) 
 	{ 
 		BMI = 703*(weight/(height*height)); 
 		System.out.println("Your BMI is: " + BMI); 
 		if (BMI < 18.5) 
 			condition = "Underweight"; 
 		else if (BMI <= 24.9) 
 			condition = "Normal"; 
 		else if (BMI <= 29.9) 
 			condition = "Overweight"; 
 		else if (BMI <= 34.9) 
 			condition = "Obese"; 
 		else if (BMI <= 39.9) 
 			condition = "Very Obese"; 
 		else  
 			condition = "Morbidly Obese"; 
 		System.out.println("You are " + condition); 
 	} 
 } 


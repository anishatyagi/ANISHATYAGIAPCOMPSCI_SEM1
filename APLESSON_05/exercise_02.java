import java.util.Scanner; 
 public class exercise_02 
 { 
 	public static void main(String[]args) 
 	{ 
 		Scanner keyboard = new Scanner(System.in); 
 		exercise_02 form = new exercise_02(); 
 		 
 		System.out.println("Please, enter item 1"); 
 		String itemuno = keyboard.next();	 
 		 
 		System.out.println("Please, enter the price"); 
 		double priceuno = keyboard.nextDouble(); 
 		 
 		keyboard.nextLine(); 
 		 
 		System.out.println("Please, enter item 2"); 
 		String itemdos = keyboard.next();	 
 		 
 		System.out.println("Please, enter the price"); 
 		double pricedos = keyboard.nextDouble(); 
 		keyboard.nextLine(); 
 	 
 		System.out.println("Please, enter item 3"); 
 		String itemtres = keyboard.next();	 
 		 
 		System.out.println("Please, enter the price"); 
 		double pricetres = keyboard.nextDouble(); 
 		keyboard.nextLine(); 
 		 
 
 		System.out.println("Please, enter item 4"); 
 		String itemquatro = keyboard.next(); 
 		 
 		System.out.println("Please, enter the price"); 
 		double pricequatro = keyboard.nextDouble(); 
 		 
 		double Subtotal = priceuno+pricedos+pricetres+pricequatro; 
 		double discount = totalDisc(Subtotal); 
 		double Tax = .08 * Subtotal; 
 		double Total = Subtotal - discount + Tax; 
 		 
 		System.out.println("<<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>>"); 
 		form.format(itemuno, priceuno); 
 		form.format(itemdos, pricedos); 
 		form.format(itemtres, pricetres); 
 		form.format(itemquatro, pricequatro); 
 		form.format("Subtotal:", Subtotal); 
 		form.format("Discount:", discount); 
 		form.format("Tax:", Tax); 
 		form.format("Total:", Total); 
 		System.out.println("______________________________________________"); 
 		System.out.println(" * Thank you for your support! Come Again!! * "); 
 		 
 	} 
 	 
 	public static double totalDisc(double t) 
 	{ 
 		double discount = 0; 
 		if (t>=2000) 
 		{ 
 			discount = t * 0.15; 
 		} 
 		 
 		if (t<2000) 
 		{ 
 			discount = 0; 
 		} 
 		 
 		return discount; 
 	} 
 	 
 	public void format(String item, double price) 
 	{ 
 		System.out.printf("* %20s ..........  %10.2f\n", item, price); 
 	} 
 	 
 } 




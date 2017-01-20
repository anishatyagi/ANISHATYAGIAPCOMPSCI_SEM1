import java.util.Scanner; 
 public class PUBLICCLASSINVENTORYITEMS
 { 
 	public static void main(String[]args) 
 		{ 
 			Scanner kb = new Scanner(System.in); 
 			EX06INVENTORYITEMS object; 
 			System.out.println("What is the Item Manufacturer??"); 
 			String ItemManufacturer = kb.next(); 
 			System.out.println("What is the item name??"); 
 			String ItemName = kb.next(); 
 			System.out.println("Would you like to enter item category and price? Y or N?"); 
 			String YorN = kb.next(); 
 			if (YorN.equals("N")) 
 			{ 
 				object = new EX06INVENTORYITEMS(ItemManufacturer,ItemName); 
 				System.out.println(object); 
 			} 
 			else 
 			{ 
 				System.out.println("What is the item Category??"); 
 				String ItemCategory = kb.next(); 
 				System.out.println("What is the item price??"); 
 				int price = kb.nextInt(); 
 				object = new EX06INVENTORYITEMS(ItemManufacturer,ItemName, ItemCategory, price); 
 				System.out.println(object); 
 			} 
 		 
 		} 
 } 


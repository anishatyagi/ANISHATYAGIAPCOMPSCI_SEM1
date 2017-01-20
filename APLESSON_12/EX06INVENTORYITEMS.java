public class EX06INVENTORYITEMS
 { 
 	private String ItemManufacturer; 
 	private String ItemName; 
 	private String ItemCategory; 
 	private int UPC; 
 	private int price; 
 
 
 	public EX06INVENTORYITEMS() 
 	{ 
 		ItemManufacturer = ""; 
 		ItemName = ""; 
 		ItemCategory = ""; 
 		UPC = 0;  
 		price = 0; 
 	} 
 	 
 	 
 	public EX06INVENTORYITEMS(String IM, String IN) 
 	{ 
 		ItemManufacturer = IM; 
 		ItemName = IN; 
 		ItemCategory = "Undefined"; 
 		UPC = (int)(Math.random() * 1000000000) + 1; 
 	} 
 	 
 	public EX06INVENTORYITEMS(String IM, String IN, String IC, int p) 
 	{ 
 		ItemManufacturer = IM; 
 		ItemName = IN; 
 		ItemCategory = IC; 
 		UPC = (int)(Math.random() * 1000000000) + 1; 
 		price = p; 
 	} 
 	 
 	public String toString() 
 	{ 
 		return "Inventory Items!!!\nItem Manufacturer: " + ItemManufacturer + 
                            "\nItem Name: " + ItemName + 
                            "\nItem Category: " + ItemCategory + 
                            "\nUPC #: " + UPC + 
 						   "\nPrice: " + price; 
 	} 
 	 
 } 





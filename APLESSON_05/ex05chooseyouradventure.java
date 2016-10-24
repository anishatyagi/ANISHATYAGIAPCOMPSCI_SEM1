import java.util.Scanner; 
 public class ex05chooseyouradventure
 { 
 	public static void main(String[]args) 
 	{ 
 	Scanner kb = new Scanner(System.in); 
 	System.out.println("I need to finish my homework but I can't find the assignment. What should I do?" + 
 	"\n1. Check online." +  
 	"\n2. Ask a friend."); 
 	int choice1 = kb.nextInt(); 
 	if (choice1 == 1) 
 	{ 
		System.out.println("Well that didn't help. Now what should I do?" +  
		"\n1. Email the teacher." +  
		"\n2. Look through my binder."); 
		int choice2 = kb.nextInt(); 
		if (choice2 == 1) 
		{	 
			System.out.println("This is taking too much time. Let's do something else...." + 
			"\n1. Go outside for a walk. Maybe I'll remember what the assignment is." +  
			"\n2. Take a nap. Maybe after resting my brain I might remember."); 
			int choice3 = kb.nextInt(); 
			if (choice3 == 1) 
			{ 
				System.out.println("Oh yeah, now I remember what the assignment is. I can get it done!"); 
			} 
			else 
				System.out.println("Yes! I woke up and I remember what the assignment is! Now i can get it done!1"); 
			}	 
		else  
		{ 
			System.out.println("Ok, I am running out of time. How can I get this stupid assignment done?" + 
			"\n1. Walk to friends house and ask." +  
			"\n2. Ask my brother if he stole my assignment."); 
			int choice3 = kb.nextInt(); 
			if (choice3 == 1) 
			{ 
				System.out.println("Finally, you know the assignment. Now you can get it done!"); 
			} 
			else 
				System.out.println("My brother had it! Ok, now I can get the assignment done!"); 
		} 
 	} 
 	else 
 	{ 
		System.out.println("Only a few hours left. What can I do now?" +  
		"\n1. Turn in a fake assignment" +  
		"\n2. Don't go to class"); 
		int choice2 = kb.nextInt(); 
		if (choice2 == 1) 
		{	 
			System.out.println("Ok, now I just feel guilty. I need to come up with a real solution!" + 
			"\n1. Call friend again" +  
			"\n2. Check email again to see if teacher responded."); 
			int choice3 = kb.nextInt(); 
			if (choice3 == 1) 
			{ 
				System.out.println("Yes she picked up her phone and told me the assignment. Now I can get it done!"); 
			} 
			else 
				System.out.println("The teacher responded. You can finally get the assignment done!"); 
		}	 
		else  
		{ 
			System.out.println("Is there anything else I can do?" + 
			"\n1. Check backpack." +  
			"\n2. Ask a Facebook friend."); 
			int choice3 = kb.nextInt(); 
			if (choice3 == 1) 
			{ 
				System.out.println("Yay! It was in the back of my bag! Now I can get the assignment done!"); 
			} 
			else 
				System.out.println("Facebook is a lifesaver. I can get the assignment done now!"); 
		} 
 	} 
 	}
 } 

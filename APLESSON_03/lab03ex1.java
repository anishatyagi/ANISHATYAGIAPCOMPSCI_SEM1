
import java.util.Scanner;

public class lab03ex1{
    public static void main (String [] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hi, my name is RudeAI.");
        System.out.println("I'd like to ask you a few questions.");
        System.out.println("What is your name?");

        String name = keyboard.nextLine();
        System.out.println(name + " is a stupid name.");
        System.out.println("How old are you, " + name + "?");

        int age = keyboard.nextInt();
		keyboard.nextLine();
        System.out.println("You're " + age +"!? That's sad.");
		
		System.out.println("What do you do for fun, " + name + "?");
		String fun = keyboard.nextLine();
		System.out.println(fun+ "?!?! That's what babies do");
		
		System.out.println("What kind of music do you like, " + name + "?");
		String music = keyboard.nextLine();
		System.out.println(music + " sounds like a barking dog.");
		
		System.out.println("How many siblings do you have, " + name + "?");
		String siblings = keyboard.nextLine();
		System.out.println(siblings + "! They must be a lot smarter than you.");
		
		System.out.println("What do you want to be when you grow up, " + name + "?");
		String grow = keyboard.nextLine();
		System.out.println("Have fun becoming a " + grow +".");
    }
}

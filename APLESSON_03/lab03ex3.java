import java.util.Scanner;
import java.lang.Math;

public class lab03ex3 {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an x value for a coordinate.");
        double x1 = keyboard.nextDouble();

        System.out.println("Enter a y value for the coordinate.");
        double y1 = keyboard.nextDouble();

        System.out.println("Enter an x value for a different coordinate");
        double x2 = keyboard.nextDouble();

        System.out.println("Enter the y value for the coordinate.");
        double y2 = keyboard.nextDouble();

        double dist = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("The distance between those two points is: " + dist);
    }
}

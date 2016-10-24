import java.util.Scanner; 
 public class ex03gpa 
 { 
 	public static void main(String[]args) 
 	{ 
 	Scanner kb = new Scanner(System.in); 
 	 
 	System.out.println("Please enter the first subject:"); 
 	String s1 = kb.nextLine(); 
 	System.out.println("Please enter letter grade: "); 
 	String grade1 = kb.next(); 
 	kb.nextLine(); 
 	 
 	System.out.println("Please enter the second subject: "); 
 	String s2 = kb.nextLine(); 
 	System.out.println("Please enter letter grade: "); 
 	String grade2 = kb.next(); 
 	kb.nextLine(); 
 	 
 	System.out.println("Please enter the third subject:"); 
 	String s3 = kb.nextLine(); 
 	System.out.println("Please enter letter grade: "); 
 	String grade3 = kb.next(); 
 	kb.nextLine(); 
 	 
 	System.out.println("Please enter the fourth subject: "); 
 	String s4 = kb.nextLine(); 
 	System.out.println("Please enter letter grade: "); 
 	String grade4 = kb.next(); 
 	kb.nextLine(); 
 	 
 	System.out.println("Please enter the fifth subject:"); 
 	String s5 = kb.nextLine(); 
 	System.out.println("Please enter letter grade: "); 
 	String grade5 = kb.next(); 
 	kb.nextLine(); 
 	 
 	System.out.println("Please enter the sixth subject: "); 
 	String s6 = kb.nextLine(); 
 	System.out.println("Please enter letter grade: "); 
 	String grade6 = kb.next(); 
 	kb.nextLine(); 
 	 
 	System.out.println("Please enter the seventh subject: "); 
 	String s7 = kb.nextLine(); 
 	System.out.println("Please enter letter grade: "); 
 	String grade7 = kb.next(); 
 	kb.nextLine(); 
 	 
 	double gradePoints = (calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3)+ calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7))/7; 
 	 
 	System.out.println(gradePoints); 
 	} 
 	 
 	public static double calcPoints(String grade) 
 	{ 
 	if (grade.equals("A")) 
 	return 4.0; 
 	else if (grade.equals("B")) 
 	return 3.0; 
 	else if (grade.equals("C")) 
 	return 2.0; 
 	else if (grade.equals("D")) 
 	return 1.0; 
 	else 
 	return 0.0; 
 	} 
 } 


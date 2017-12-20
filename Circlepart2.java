import java.util.Scanner;
public class Circlepart2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		final double PI = 3.14159;
		
		int radius1, radius2;
		
		System.out.println("Enter the radius of the circle");
		radius1 = scan.nextInt(); 
		
		double area1 = PI * radius1 * radius1;
		double circumference1 = 2 * (PI * radius1);
		
		System.out.println("The area is " + area1);
		System.out.println("The circumference is " + circumference1);
		 
		System.out.println("Enter the second radius");
		radius2 = scan.nextInt();
		
		double area2 = PI * radius2 * radius2;
		double circumference2 = 2 * (PI * radius2);

		System.out.println("The 2nd area is " + area2);
		System.out.println("The 2nd circumference is " + circumference2);
		
		System.out.println("The area change is " + (area2/area1));
		System.out.println("The circumference change is " +
							(circumference2/circumference1));	
	}

}

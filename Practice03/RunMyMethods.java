import java.util.Scanner;

public class RunMyMethods {

	public static void main(String[] args) {
		MyMethods mm = new MyMethods();
		Scanner scan = new Scanner (System.in);
		
		//method surface
		int w, l, d;
		System.out.println("Enter the width, length and depth  of a rectangular box: ");
		w = scan.nextInt();
		l = scan.nextInt();
		d = scan.nextInt();
		
		System.out.println("The total surface area is: " + mm.surface(w, l, d));
		System.out.println();
		
		//method triple
		String tri;
		System.out.println("Enter one String: ");
		tri = scan.next();
		
		System.out.println("The first character printed out 3 times: " + mm.triple(tri));
		System.out.println();
		
		//method area
		int b, h;
		System.out.println("Enter the base and height of the right triangle: ");
		b = scan.nextInt();
		h = scan.nextInt();
		
		System.out.println("The area of the right triangle is: " + mm.area(b, h));
		System.out.println();
		
		//method rightTriangle
		double side, hyp;
		
		System.out.println("Enter a side and hypotenuse of a right triangle: ");
		side = scan.nextDouble();
		hyp = scan.nextDouble();
		
		System.out.println("The missing side is: " + mm.rightTriangle(side, hyp));
		System.out.println();
		
		//method cutString
		String mutation;
		System.out.println("Enter a string: ");
		mutation = scan.next();
		
		System.out.println("The string with the first and last letter removed is: " + mm.cutString(mutation));
		System.out.println();
		
		//method temp
		int cel;
		System.out.println("Enter the temperature in celsius: ");
		cel = scan.nextInt();
		
		System.out.println("The fahrenheit equivalent is: " + mm.temp(cel));
		System.out.println();
		
		//method quintSum
		int num1, num2;
		System.out.println("Enter two integers: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.println("The sum quintupled is: " + mm.quintSum(num1, num2));
		System.out.println();
		
		//method qoutes
		String first, last;
		System.out.println("Enter two strings: ");
		first = scan.next();
		last = scan.next();
		
		System.out.println("Both string combined is " + mm.quotes(first, last));
		

	}

}

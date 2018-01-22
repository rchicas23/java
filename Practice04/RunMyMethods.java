import java.util.Scanner;

public class RunMyMethods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyMethods mm = new MyMethods();
		
		//method isBig
		String alpha;
		System.out.println("Enter one string: ");
		alpha = scan.nextLine();
		
		if (mm.isBig(alpha))
			System.out.println("The length of the String is greater than 6.\n");
		else
			System.out.println("The length of the String is equal to or less than 6.\n");
		
		//method oddEven
		String oddEven;
		System.out.println("Enter one string: ");
		oddEven = scan.nextLine();
		System.out.println(mm.oddEven(oddEven));
		System.out.println();
		
		//method looks
		int w, l;
		System.out.println("Enter the width and length: ");
		w = scan.nextInt();
		l = scan.nextInt();
		System.out.println(mm.looks(w, l));
		System.out.println();
		
		//method inRange
		int num;
		System.out.println("Enter an integer: ");
		num = scan.nextInt();
		if (mm.inRange(num) == true)
			System.out.println("The number you enter is between 1 and 100.");
		else
			System.out.println("The number you enter is NOT between 1 and 100.");
		System.out.println();
		
		//method greater
		int a, b;
		System.out.println("Enter two integers for side A and side B. ");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println(mm.greater(a,b));
		System.out.println();
		
		//method outlier
		System.out.println(" is a random number that is less then 10 or greater then 20: " + mm.outlier());
		System.out.println();
		
		//method numBall
		int num1, num2;
		System.out.println("Enter two integers: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println(mm.numBall(num1, num2));
		System.out.println();

		
		//method positive
		int alfa, beta, gama;
		System.out.println("Enter 3 integers (positive or negative): ");
		alfa = scan.nextInt();
		beta = scan.nextInt();
		gama = scan.nextInt();
		System.out.println("You entered " + mm.positive(alfa, beta, gama) + " non-negative numbers\n");
		
		//method bigNum
		int first, mid, last;
		System.out.println("Enter 3 integers: ");
		first = scan.nextInt();
		mid = scan.nextInt();
		last = scan.nextInt();
		
		System.out.println("The largest number is " + mm.bigNum(first, mid, last) + "\n");
		
		
		//method posNeg
		System.out.println("1000 numbers will be generated from -5 to 5 and the postive, negative, and zeros will be counted.\n");
		mm.posNeg();
		
		//method isDigit
		char i;
		System.out.println("Enter any character: ");
		i = scan.next().charAt(0);
		if (mm.isDigit(i) == true)
			System.out.println(i + " is a digit.\n");
		else
			System.out.println(i + " is not a digit.\n");
			
		//method isLower
		char in;
		System.out.println("Enter any lowercase or uppercase character: ");
		in = scan.next().charAt(0);
		
		if (mm.isLower(in) == true)
			System.out.println(in + " is a lower case.");
		else
			System.out.println(in + " is not a lower case.");
		

	}

}

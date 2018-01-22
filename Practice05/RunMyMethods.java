import java.util.Scanner;

public class RunMyMethods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyMethods mm = new MyMethods();
		
		//method roll
		System.out.println("A random number will be generated between 1 and 100 (inclusive).");
		System.out.println(mm.roll());
		
		//method posNeg
		System.out.println("\n1000 numbers have been generated between -5 and 5."
				+ "\nThe amount of zeros, positive and negative are: \n");
				mm.posNeg();
		
		
		//method alpha
		System.out.println("\nThe amount of b's generated are: " + mm.alpha());
		System.out.println();
		
		//method reverse
		System.out.println("Enter a string as long as you want. It will be reversed with 20 characters a line.");
		String input = scan.nextLine();
		mm.reverse(input);
		
		
		//method rangeSum
		int first, last;
		System.out.println("\nEnter two integers.");
		first = scan.nextInt();
		last = scan.nextInt();
		
		System.out.println("The sum of the integers in between are: " + mm.rangeSum(first, last));
		System.out.println();
		
		//method binary
		System.out.println("The first 15 non-negative powers of 2 are: "); 
		mm.binary();
		System.out.println();
		
		//method digit
		int num;
		System.out.println("\nEnter an integer number.");
		num = scan.nextInt();
		
		System.out.println(num + " has " + mm.digit(num) + " numbers.");
	}

}

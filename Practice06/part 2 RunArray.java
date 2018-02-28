import java.util.Arrays;
import java.util.Scanner;

public class RunArray2{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayMethods2 am2 = new ArrayMethods2();
		
		//initialize method
		System.out.println("Method \"initialize\"");
		int rowSize, colSize;
		int[][] matrix;
		
		System.out.println("Enter a size for a square matrix.");
		System.out.print("row size: ");
		rowSize = scan.nextInt();
		
		System.out.print("col size: ");
		colSize = scan.nextInt();
		
		matrix = new int[rowSize][colSize];
		
		am2.initialize(matrix);
		for(int i=0; i<matrix.length; i++){
			for (int j=0; j<matrix[i].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
		
		//total method
		System.out.println("\n\nMethod \"totals"+ "\"");
		System.out.println("Enter dimension of two dimensonal array");
		System.out.print("row size: ");
		int row = scan.nextInt();
		
		System.out.print("col size: ");
		int col = scan.nextInt();
		
		int[][] twoDArray = new int[row][col];
		
		System.out.println("Enter matrix.");
		for(int i=0; i < twoDArray.length; i++){
			for(int j=0; j < twoDArray[i].length; j++)
				twoDArray[i][j] = scan.nextInt();
		}
		
		System.out.println("The array entered is: ");
		for(int i=0; i < twoDArray.length; i++){
			for(int j=0; j < twoDArray[i].length; j++)
				System.out.print(twoDArray[i][j] + " ");
			System.out.println();
		}
		
		int[] sum = am2.totals(twoDArray);
		System.out.println("Sum of the columns: ");
		System.out.println(Arrays.toString(sum));
		
		//vowels method
		System.out.println("\nMethod \"vowels"+ "\"");
		System.out.println("How many words will you like to input?");
		int amount = scan.nextInt();
		String[] words = new String[amount];
		
		System.out.println("Input your words.");
		for (int i = 0; i < words.length; i++)
			words[i] = scan.next();
		
		//System.out.println(Arrays.toString(words));
		
		System.out.println("\nWord " + (am2.vowels(words) + 1) + " has the most vowels" );
		
		//count method
		System.out.println("\nMethod \"count" + "\"");
		System.out.println("How many integers would like to input?");
		int length = scan.nextInt();
		int[] integers = new int[length];
		
		System.out.println("Enter your numbers: ");
		for(int i=0; i<integers.length; i++)
			integers[i] = scan.nextInt();
		
		int min = integers[0];
		for(int i=0; i<integers.length; i++){
			if(min > integers[i])
				min = integers[i];
		}
		System.out.println(am2.count(integers, min) + " number(s) are greater then the smallest nubmer (" + min +")");
		
		//order method
		System.out.println("\nMethod \"order" + "\"");
		System.out.println("The min and max from the previous entered array are: ");
		am2.order(integers);
		
		
		//summit method
		System.out.println("\nMethod \"summit" + "\"");
		System.out.println("Enter two arrays." + "\nSize of first array: ");
		int arrayOne = scan.nextInt();
		int[] gamma = new int[arrayOne];
		System.out.println("\nEnter the integers for the first array: ");
		for (int i=0; i<gamma.length; i++)
			gamma[i]=scan.nextInt();
		
		System.out.println("Size of second array: ");
		int arrayTwo = scan.nextInt();
		int[] delta = new int[arrayTwo];
		System.out.println("\nEnter the integers for the second array: ");
		for (int i=0; i<delta.length; i++)
			delta[i]=scan.nextInt();
		
		if(arrayOne == arrayTwo){
			int[] sumSame = am2.summit(gamma, delta);
			System.out.println("Sum of corresponding indexes: ");
			for(int i=0; i<sumSame.length; i++)
				System.out.print(sumSame[i] + " ");
			
		}
		else{
			int[] sumDiff = am2.summit(gamma, delta);
			System.out.println("Lengths are not the same: ");
			for(int i=0; i<sumDiff.length; i++)
				System.out.print(sumDiff[i] + " ");
		}
		
		//summit border
		System.out.println("\nMethod \"border" + "\"");
		System.out.println("Choose the size of a 2D array. " + "\nrow size: ");
		int row2D = scan.nextInt();
		
		System.out.println("col size: ");
		int col2D = scan.nextInt();
		char[][] array = new char[row2D][col2D];
		
		am2.border(array);
		
		for(int i=0; i<array.length; i++){
			for (int j=0; j<array[i].length; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
		
	}
}

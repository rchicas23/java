import java.util.Scanner;

public class ReverseIntArray {

	public static void main(String[] args) 
	{
		
		int MAX = 5; 
		int[] list = new int[MAX];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 5 intergers: ");
		
		//accepts values
		for (int i = 0; i<MAX; i++)
		 {
			list[i] = scan.nextInt(); 
		 }
		
		//prints out values
		System.out.println("\nValues are:");
		for (int i=0; i<MAX; i++)
		{
			System.out.print(list[i]);
			System.out.print(" ");
		}
		
		//puts in reverse order
		for(int i=0; i< MAX/2; i++)
		{
			int temp = list[i];
			list[i] = list[MAX-1-i];
			list[MAX-1-i] = temp;
		}
		
		//print reverse order
		System.out.println("\nReverse order is:");
		for (int i=0; i<MAX; i++)
		{
			System.out.print(list[i]);
			System.out.print(" ");
		}
		

	}

}

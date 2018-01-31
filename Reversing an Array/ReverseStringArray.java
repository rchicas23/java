import java.util.Scanner;

public class ReverseStringArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line;
		System.out.println("Enter a string.");
		line = scan.nextLine();
		
		char[] input = line.toCharArray(); //changes string into a char array
		
    //reverses the string character by character
		for (int i=0; i<=(input.length-1)/2; i++){
			char temp = input[i];
			input[i] = input[input.length-1-i];
			input[input.length-1-i] = temp;
		}
		
    //prints the reversed string
		for(int j = 0; j<input.length; j++){
			System.out.print(input[j]);
			 }

	}

}

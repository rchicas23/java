import java.util.Scanner;

public class MyMethods {
	Scanner scan = new Scanner(System.in);
	
	public void codename(){
		String lastName;
		
		
		System.out.println("What is your last name?");
		lastName = scan.nextLine();
		char first = lastName.charAt(0);
		char last = lastName.charAt(lastName.length() - 1);
		String middle = lastName.substring(1, lastName.length()-1);
		
		System.out.println("First letter is: " + first +
							"\nBetween letters: " + middle +
							"\nLast letter: " + last + "\n");
	}
	
	public void middle(){
		String word;
		
		
		System.out.println("Enter a word with an odd number of letters: ");
		word = scan.nextLine();
		
		while(word.length()%2 == 0){
			System.out.println("The word you entered does not have an odd number of letters.\n" +
								"Enter another word: ");
			word = scan.nextLine();
		}
		
		char middle = word.charAt(word.length()/2);
		System.out.println("Letter in the middle is: " + middle + "\n");	
	}
	
	public void second(){
		String word;
	
		System.out.println("Enter a 7 letter word: ");
		word = scan.nextLine();
		
		char secondLetter = word.charAt(1);
		char nextLast = word.charAt(word.length() - 2);
		
		System.out.println("Second letter in the word: " + secondLetter +
							"\nNext to Last letter in the word: " + nextLast + "\n");
		
	}
	
	public void letter(){
		String word;
		char firstLetter;
		char secLetter;
		
		do{
			System.out.println("Enter a two letter word (word must be in alphabetical order).");
			word = scan.nextLine();
			word.toLowerCase();	
			
			firstLetter = word.charAt(0);
			secLetter = word.charAt(1);
			
		}while(firstLetter > secLetter);
		
		char midLetter = (char) ((secLetter + firstLetter)/2);
		System.out.println("The letter in between " + firstLetter + " and " + secLetter + " is " + midLetter + "\n");
	}
	
	public void reverse(){
		
		String wordOne, wordTwo, wordThree;
		
		System.out.println("Enter three words: ");
		wordOne = scan.next();
		wordTwo = scan.next();
		wordThree = scan.nextLine();
		
		System.out.println("\nThe three word in reverse order are:\n" + wordThree + " " + wordTwo + " " + wordOne);
		
	}

}

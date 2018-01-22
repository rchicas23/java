import java.util.Random;
import java.util.Scanner;

public class MyMethods {
	Random generator = new Random();
	Scanner scan = new Scanner(System.in);
	
	public boolean isBig(String alpha){
		return alpha.length()>6;
	}
	
	public String oddEven(String message){
		if (message.length()%2 == 0){
			char first = message.charAt(0); 
			char last = message.charAt(message.length()-1);
			return first + "" + last;
		}else{
			char middle = message.charAt((message.length()-1)/2);
			return middle + "";
		}
	}
	
	public String looks(int width, int length){
		if(length > 2*width)
			return "skinny";
		
		else if(width > 2*length)
			return "fat";
		
		else if (width == length)
			return "square";
		else
			return "Not quite skinny,fat, or same";
	}
	
	public boolean inRange(int original){
		if (original <= 100 && original >= 1)
			return true;
		else
			return false;
	}
	
	public boolean greater(int sideA, int sideB){
		if(sideA > sideB)
			return true;
		else
			return false;
	}
	
	public boolean outlier(){
		int num = generator.nextInt(30) + 1;
		System.out.print(num);
		
		if (num < 10 || num > 20)
			return true;
		else
			return false;
	}
	
	public int numBall (int num1, int num2){
		if (num1 % 2 != 0 && num2 % 2 != 0)
			return -1;
		if (num1 % 2 == 0 && num2 % 2 == 0)
			return 1;
		else
			return 0;
	}
	
	public int positive(int alfa, int beta, int gama){
		int count=0;
		
		if(alfa >= 0)
			count++;
			
		if(beta >= 0)
			count++;

		if(gama >= 0)
			count++;
		
		return count;
	}
	
	public int bigNum(int first, int mid, int last){
		int largest;
		
		if(first > mid && first > last)
			largest = first;
		else if (mid > first && mid > last)
			largest = mid;
		else
			largest = last;
		
		return largest;
	}
	
	public void posNeg(){
		int pos=0, neg=0, zero=0;
		final int MAX = 1000;
		
		int[] arr = new int[MAX];
		
		for(int i=0; i<MAX; i++)
		{
			arr[i] = generator.nextInt(11) - 5; //random number between -5 and +5
			
			if(arr[i] > 0)
				pos++;
			else if(arr[i] < 0)
				neg++;
			else
				zero++;
			//System.out.println(arr[i] + " ");
		}
		
		System.out.println("The number of positive numbers: " + pos + "\n" +
							"The number of negative nubmers: " + neg + "\n"+
							"The number of zeros: "+ zero + "\n");
		
	}
	
	public boolean isDigit(char letter){
		boolean answer = false;
		
		if (Character.isDigit(letter))
			answer = true;
		
		return answer;
	}
	
	public boolean isLower(char letter){
		boolean answer = false;
		
		if(Character.isLowerCase(letter))
			answer = true;
		
		return answer;
	}

}

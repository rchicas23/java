import java.util.Random;
import java.text.DecimalFormat;

public class MyMethods {
	Random generator = new Random();
	
	public String roll(){
		int num = generator.nextInt(100) + 1;
		String answer = " ";
		
		
		if (num > 50 && num % 2 == 0)
			answer = "even > 50";
		if (num > 50 && num %2 != 0)
			answer =  "odd > 50";
		if (num < 50&& num % 2 == 0)
			answer = "even < 50";
		if (num < 50 && num %2 != 0)
			answer =  "odd < 50";
		if (num == 50)
			answer = "50";
		
		System.out.print("The number is " + num + ".\nIt is ");
		
		return answer;
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
		
		System.out.println("positive: " + pos + "\n" +
							"negative: " + neg + "\n"+
							"zeros: "+ zero + "\n");
	}
	
	public int alpha(){
		int count = 0;
		char[] arrChars = new char [50];
		
		System.out.print("The characters generated are: ");
		for(int i =0; i < 50; i++){
			char letter = (char)(generator.nextInt(2) + 97);
			
			arrChars[i] = letter;
			System.out.print(arrChars[i] + " ");
			
			if (arrChars[i] == 'b')
				count++;
		}
		
		return count;	
	}
	
	public void reverse(String fragment){
		char[] input = fragment.toCharArray();
		int count = 0;
		
		for (int i=0; i<(input.length-1)/2; i++){
			char temp = input[i];
			input[i] = input[input.length-1-i];
			input[input.length-1-i] = temp;
		}
		
		for(int j = 0; j<input.length; j++){
			System.out.print(input[j]);
			 count++;
			 
			 if(count == 20){
				 System.out.println();
				 count = 0;
			 }
		}
		
		System.out.println();
	}
	
	public int rangeSum(int first, int last){
		int sum=0;
		
		if (first > last){
			for(int i = last; i<= first; i++){
				int temp = i;
				sum += temp; 
			}
		}
		
		if(last > first){
			for(int j=first; j<=last; j++){
				int temp = j;
				sum += temp; 
			}
		}
		
		else //both parameters are equal to each other (n to n) = n == n+0
			sum = first; 
		
		return sum;
	}
	
	public void binary(){
		//DecimalFormat fmt = new DecimalFormat ("0.###");
		
		
		for (int i = 0; i<15; i++){
			double power = Math.pow(2, i);
			System.out.print(power + " ");
		}
		
	}
	
	public int digit(int num){
		int count = 0;
		long temp = 1;
		int absNum = Math.abs(num);
		
		while(temp <= absNum){
			count++;
			temp *= 10;
		}
		return count;
	}

}


public class ArrayMethods2 {
	
	public void initialize(int[][] array){
		for (int row = 0; row< array.length; row++){
			for(int col=0; col<array[row].length; col++){
				int sum = col + row; //creates value to put in the index that is not on the major diagonal
				if (row == col)
					array[row][col] = -1; //sets the major diagonal to -1
				else
					array[row][col] = sum;
			}
		}
	}
	
	public int[] totals (int[][] array){
		int[] sumCol = new int[array[0].length]; //one dimensional array where the sum of each column will be stored
		
		for(int row = 0; row < array.length; row++){
			for(int col = 0; col < array[row].length; col++){
				sumCol[col] += array[row][col]; //puts the sum of column x and stores it in a one dimensional array
			}
		}
		return sumCol;
	}
	
	public int vowels (String[] alpha){
		int maxVal = 0, maxIndex = 0;
		
		for(int i = 0; i <alpha.length; i++){ //goes through the array to find each string
			String temp = alpha[i]; //stores the string in a temporary place
			temp = temp.toLowerCase(); //changes the string to lower case
			int vowelCount = 0; //resets sum of vowels to zero
			
			for(int j =0; j < temp.length(); j++){ //goes through the string to find a vowel
				char x = temp.charAt(j);
				//System.out.print(x + " ");
				
				if(x == 'a' ||
					x == 'e' || 
					x == 'i' || 
					x == 'o' || 
					x == 'u')
					vowelCount++; //stores the amount of vowels for each string at each index	
			}
			
			if(vowelCount >= maxVal){
				maxVal = vowelCount;
				maxIndex = i;
			}
		}
		
		return maxIndex;
	}

	public int count(int[] array, int min){
		int count = 0;
		for (int i =0; i<array.length; i++){
			if (array[i]>min) 
				count++; //counts how many numbers are greater then the smallest number
		}
		return count;
	}
	
	public void order(int[] digits){
		int min = digits[0];
		int max = digits[0];
		
		for(int i =0; i<digits.length; i++){
			if (digits[i]<min)
				min = digits[i]; //find the smallest number in the array
			else if (digits[i]>max)
				max = digits[i]; //find the largest number in the array
		}
		
		System.out.println("Min: " + min + "\nMax: " + max); //print out the smallest and largest number
	}
	
	public int[] summit(int[] gamma, int[] delta){
		
		if(gamma.length == delta.length){ //decides if both arrays are equal to each other
			int[] sum = new int[gamma.length];
			for (int i = 0; i<gamma.length; i++){
				sum[i] = gamma[i] + delta [i]; //if both arrays are equal to each other in length the number in equivalent indexes are added
			}
			
			return sum; //returns the new array of the indexes added together
				
		}
		else{
			int[] different = new int[10];
			for(int i=0; i<different.length; i++)
				different[i] = -1; //if both arrays are different in size an array of size 10 is created and filled with -1
			return different;
		}
	}
	
	public void border(char[][] array){
		for (int row = 0; row<array.length; row++){
			for(int col = 0; col<array[row].length; col++){
				
				if(row == 0 || row == array.length-1){
					array[0][col] = 'o';
					array[array.length-1][col] = 'o';
				}
				else if(col==0 || col == array[row].length-1){
					array[row][array[row].length-1] = 'o';
					array[row][0] = 'o';
				}
				else
					array[row][col] = 'x';
			}
		}
	}
}

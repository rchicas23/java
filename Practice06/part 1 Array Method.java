import java.util.ArrayList;

public class ArrayMethods {
	
	public void init(int[] list){
		for (int i = 0; i<list.length; i++){
			list[i] = i + 5;
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	
	public void setup(int[] list){
		for  (int i = 0; i<list.length; i++){
			if(list[i] % 2 != 0)
				list[i] = -1;
			else
				list[i] = i;
			System.out.print(list[i] + " ");
		}
		System.out.println("\n");
	}
	
	public void reverse(int[] list){
		
		for (int i = 0; i<=list.length/2; i++){
			int temp = list[i];
			list[i] = list[list.length-i-1];
			list[list.length-i-1] = temp;
		}
		
		for (int i = 0; i<list.length; i++)
			System.out.print(list[i] + " ");
	}
	
	public void oddEven(int[] list){
		int countOdd = 0, countEven = 0, countZero = 0;
		for (int i = 0; i<list.length; i++){
			if (list[i] == 0)
				countZero++;
			else if (list[i]%2 != 0)
				countOdd++;
			else
				countEven++;
		}
		
		System.out.println ("Number of Odd integers: " + countOdd + "\nNumber of Even integers: " + countEven + 
				"\nNumebr of Zero's: " + countZero);
	}
	
	public String direction(int[] list){
		boolean up = true, down = true;
		
		for (int i = 0; i<list.length-1; i++){
			if(!(list[i]>list[i+1]))
				down = false;
			if(!(list[i]<list[i+1]))
				up = false;
		}
		
		if(up == false && down == false)
			return "no_order";
		
			else if (up)
				return "up_order";
			else
				return "down_order";
	}
	
	public double average(int[] list){
		double avg = 0, sum = 0;
		
		for(int i=0; i<list.length; i++)
			sum += list[i];
		
		avg = sum/list.length;
			
		return avg;
	}

	public void posNeg(int[] list){
		int pos = 0, neg = 0, zero =0;
		for (int i = 0; i <list.length; i++){
			System.out.print(list[i] + " ");
			if(list[i] > 0)
				pos++;
			else if(list[i] < 0)
				neg++;
			else
				zero++;
		}
			System.out.println("\nNumber of positive integers: " + pos + "\nNumber of negative integers: " + neg +
					"\nNumber of zero's: " + zero);
	}
	
	public void pairs(int[] list){
		int pair = 0;
		for (int i =0; i<list.length-1; i++){
			if (list[i]==list[i+1]){
				pair++;
				i++;
			}
		}
		System.out.println(pair);
	}
	
	public void fibo(int[] list){
		list[0] = 1; //sets the value at index 0 to 1
		list[1] = 2; //sets the value at index 1 to 2
		
		for(int i = 2; i<list.length; i++)
			 list[i] = list[i-1] + list[i-2]; //adds the previous two values to put in the next index
	}
	
	public void delete(int[] list){
		int smallest=1000000;  //significantly big int
		
		//finds smallest int in the array
		for (int i = 0; i < list.length-1; i++){
			if (smallest > list[i])
				smallest = list[i];
			}
		//converts array to arraylist
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for (int i : list)
		{
			intList.add(i);
		}
		//removes the smallest int
		for(int i =0; i < intList.size(); i++){
			if (smallest == intList.get(i)){
				intList.remove(i);
				i--;
			}
		}
		//create new array
		int[] result = new int[intList.size()];
		//converts arraylist to an array with the smallest int removed
		for (int i = 0; i<result.length; i++){
			result[i] = intList.get(i);
			System.out.print(result[i] + " ");
		}
	}
	
	public void insert(int[] list){
		int largest = -1000000; //significantly small int
		
		//searches thru array for largest value
		for (int i = 0; i <list.length; i++){
			if(largest < list[i])
				largest = list[i];
		}
		//converts array to arraylist
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for (int i : list)
		{
			intList.add(i);
		}
		//removes the smallest int
		for(int i =0; i < intList.size(); i++){
			if (largest == intList.get(i))
				intList.add(i+1, 0);
		}
		//create new array
		int[] result = new int[intList.size()];
		//converts arraylist to an array with a zero next to the largest int
		for (int i = 0; i<result.length; i++){
			result[i] = intList.get(i);
			System.out.print(result[i] + " ");
		}
	}
	
	public void group(int[] list){
		int count = 0;
		int sum5 = 0;
		int j = 0;
		int[] sum = new int[list.length/5];
		
		for (int i = 0; i<list.length; i++){

			sum5 += list[i];
			count++;
			
			if(count == 5){
				sum[j] = sum5;
				count = 0;
				sum5 = 0;
				j++;
			}
		}
		
		for (int i = 0; i<sum.length; i++)
			System.out.print(sum[i] + " ");
	}
	
	public int charPair (String letters){
		int pair = 0; //keeps count of how many pairs
		char[] characters = letters.toCharArray(); //changes the string to a char array
		
		for (int i = 0; i< characters.length-1; i++){
			if(characters[i] == characters[i+1]){
				pair++;
				i++;
			}
		}
		
		return pair;
	}
	
	
}

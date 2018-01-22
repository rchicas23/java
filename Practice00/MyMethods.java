import java.util.Scanner;

public class MyMethods {
	
	Scanner scan = new Scanner(System.in);
	
	public void farm(){
		double length, width, result;
		
		System.out.println("Enter the length and width of the farm in feet.");
		
		length = scan.nextDouble();
		width = scan.nextDouble();
		result = ((length*2)+(width*2));
		
		System.out.println(result + " feet of fence needed to enclose the farm\n");	
	}
	
	public void temp(){
		double tempF, tempC;
		
		System.out.println("What is the temperature in Farenheit?");
		tempF = scan.nextInt();
		tempC = ((tempF-32)/1.8);
		
		System.out.println("Farenheit: " + tempF +
							"\nCelcius: " + tempC + "\n");
	}
	
	public void numbers(){
		int num1 , num2, sum;
		
		System.out.println("Enter 2 numbers between 1 and 49.");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		//check if the height is between 0 and 49
		while(num1<0 || num1 > 49){
			System.out.println("Enter a correct value for the 1st number: ");
			num1 = scan.nextInt();
		}
				
		//check if the base is between 0 and 49
		while(num2<0 || num2> 49){
			System.out.println("Enter a correct value for the 2nd number: ");
			num2 = scan.nextInt();
		}
		
		sum = num1 + num2;
		String stringSum = Integer.toString(sum);
		
		System.out.println("Sum is: " + sum + 
							"\nFirst digit is: " + stringSum.charAt(0) + 
							"\nSecond digit is: " + stringSum.charAt(1) + "\n");
	}
	
	public void hypot(){
		double height, base, hyp;
		
		System.out.println("Enter the height and base or a right triangle: ");
		height = scan.nextDouble();
		base = scan.nextDouble();
		hyp = Math.sqrt((Math.pow(height, 2) + Math.pow(base, 2)));
		
		System.out.println("The hypotenus is: " + hyp + "\n");
		
		
	}
	
	public void time(){
		int hours, minutes, seconds;
		System.out.println("Enter the total number of seconds: ");
		seconds = scan.nextInt();
		
		hours = seconds/3600;
		minutes = (seconds%3600)/60;
		seconds = (seconds%3600)%60;
		
		System.out.println("The number of hours, minutes and seconds is:\n"+
							hours + " hours\n" +
							minutes + " minutes\n" +
							seconds + " seconds");
	}

}

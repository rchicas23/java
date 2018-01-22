

public class MyMethods {
	
	public int surface (int width, int length, int depth){
		
		int surfaceArea = 2 * ((length*width) + (length*depth) + (depth*width));
		return surfaceArea;
	}
	
	public String triple (String alpha){
		char firstLetter = alpha.charAt(0);
		
		return firstLetter + "" + firstLetter + "" + firstLetter;
	}
	
	public double area (int base, int height){
		double areaRightTri = .5 * base * height;
		
		return areaRightTri;
	}
	
	public double rightTriangle (double sideA, double hypotenuseB){
		double sideC = Math.sqrt(Math.pow(hypotenuseB, 2) - Math.pow(sideA, 2));
		
		return sideC;
	}
	
	public String cutString (String original){
		
		return original.substring(1, original.length()-1);	
	}
	
	public double temp(int celsius){
		double fahrenheit = 1.8 * (double) celsius + 32;
		
		return fahrenheit;
	}
	
	public int quintSum (int first, int last){
		int sum = first + last;
		
		return (5 * sum);
	}
	
	public String quotes (String first, String last){
		String combo = first + last;
		
		return "\"" + combo + "\"";
		
	}

}

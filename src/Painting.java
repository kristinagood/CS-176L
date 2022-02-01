import java.util.Scanner;

public class Painting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Define Variables
	     double costPerSqFt,length, width, height, numberOFWindows, windowLength, windowWidth, numberOFDoors, doorLength, doorWidth;  //Don't need to add value, but could if want to;
	     
	   //Inputs
	     System.out.println("Please enter the cost per square foot: ");
	     costPerSqFt = sc.nextDouble();
	    
	     
	     System.out.println("Please enter the length of the house: ");
	     length = sc.nextDouble();
	     
	     
	     System.out.println("Please enter the width of the house: ");
	     width = sc.nextDouble(); //regular
	     
	     
	     System.out.println("Please enter the height of the house: ");
	     height = sc.nextDouble(); //peak
	     
	     
	     System.out.println("Please enter the number of windows: ");
	     numberOFWindows = sc.nextDouble();
	     
	     
	     System.out.println("Please enter the length of the window: ");
	     windowLength = sc.nextDouble();
	     
	     
	     System.out.println("Please enter the width of the window: ");
	     windowWidth = sc.nextDouble();
	     
	     
	     System.out.println("Please enter the number of the doors: ");
	     numberOFDoors = sc.nextDouble();
	     
	     
	     System.out.println("Please enter the length of the door: ");
	     doorLength = sc.nextDouble();
	     
	     
	     System.out.println("Please enter the width of the door: ");
	     doorWidth = sc.nextDouble();
	     
	     
	     //Calculations
	     double sqFtForPeak = length * width + 1/2 * (length * (height - width));
	     double sqFtForRegular = length * width;
	     double surfaceArea = 2 * (width + height);
	     double squareFeet = surfaceArea - costPerSqFt;
	     double paintableSurface = 2 * (sqFtForPeak + sqFtForRegular);
	     double unpaintableSurfaces = (numberOFDoors + numberOFWindows) - paintableSurface;
	     double Estimate = squareFeet * costPerSqFt;
	    
	     //Outputs
	     System.out.println("Your total paintable surface area is " + paintableSurface + " Square feet.");
	     System.out.println("Your estimate is " + Estimate + " dollars.");
	    

	}

}

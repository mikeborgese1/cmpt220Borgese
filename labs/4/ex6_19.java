import java.util.Scanner;

public class ex6_19 {
	public static boolean isValid(  double side1, double side2, double side3) {
		
		if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
			return true;	
		}
		else {
			return false;
		}
	}
			 
	public static double area(double side1, double side2, double side3) {
				double p=(side1+side2+side3)/2;
				double area= Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
				return area;
				
			}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Enter three doubles: ");
		double side1 = keyboard.nextDouble();
		double side2 = keyboard.nextDouble();
		double side3 = keyboard.nextDouble();
		
		if (isValid(side1, side2, side3)==true) {
			System.out.println("The area of the triangle is "+ area(side1, side2, side3));
		}
		else {
			System.out.println("The inputs are invalid.");
		}
	}

}

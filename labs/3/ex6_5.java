import java.util.Scanner;

public class ex6_5 {
	public static void displaySortedNumbers( double num1, double num2, double num3) {
		double hold;
		if (num2 < num1 && num2 < num3){
			hold = num1;
			num1 = num2;
			num2 = hold;
		}
		else if (num3 < num1 && num3 < num2) {
			hold = num1; 
			num1 = num3;
			num3 = hold;
		}
		if (num3 < num2) {
			hold = num2;
			num2 = num3;
			num3 = hold;
		}
		System.out.println(num1+ ","+num2+","+ num3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Enter three doubles to be sorted.");
		double num1= keyboard.nextDouble();
		double num2= keyboard.nextDouble();
		double num3= keyboard.nextDouble();
		
		displaySortedNumbers(num1, num2, num3);
	}

}

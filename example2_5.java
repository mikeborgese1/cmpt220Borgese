import java.util.Scanner;

public class example2_5 {
	public static void main(String[] args) {
	Scanner keyboard  = new Scanner(System.in);
	System.out.println("Enter the subtotal and a gratuity rate:");
	int subtotal = keyboard.nextInt();
	int gratRate = keyboard.nextInt();
	double gratPercent = gratRate * .01;
	double gratAmount = gratPercent * subtotal;
	double total = (subtotal +gratAmount); 
	System.out.println("The gratuity is $"+gratAmount+" and total is $"+total);
	
	
	
}
}

import java.util.Scanner;

public class example2_9 {
	
	public static void main(String[] args) {
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Enter v0, v1, and t: ");
		double v0= keyboard.nextDouble();
		double v1= keyboard.nextDouble();
		double t= keyboard.nextDouble();
	
		double vDif = v1-v0;
		double ans = vDif/t;
	
		
		System.out.println( "The average acceleration is " + ans);
		
}}

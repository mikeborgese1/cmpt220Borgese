import java.util.Scanner;

public class example2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Enter a number in minutes?");
		long minIn= keyboard.nextLong();
		
		long years = minIn /(365 * 24 * 60);
		long days = minIn % (365 * 24 * 60) / (24 * 60);
		
		System.out.println( minIn +  " minutes is approximately " + years + " year(s) and " + days+ " days.");
		
	}

}

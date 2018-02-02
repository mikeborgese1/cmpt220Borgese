import java.util.Scanner;

public class example2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Enter a temperature in Celcius:");
		double cel= keyboard.nextDouble();
		double far = cel *(9/5) +12;
		System.out.println(cel + " degrees in Celcius is "+ far +" in Farenheit.");
	}

}

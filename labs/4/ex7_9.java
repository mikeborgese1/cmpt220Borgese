import java.util.Scanner;

public class ex7_9 {
	public static double min (double[] array) {
		double min= array[0];
		for (int i = 0 ; i < 10; i++) {
			if(min > array[i]) {
				min= array[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		 System.out.println("Enter ten numbers:");
		double [] num = new double[10];
		for(int i = 0 ; i < num.length ; i++){
            num[i] = keyboard.nextInt();
		}
		 
		 System.out.println("The minimum number is "+ min(num));
	}
}

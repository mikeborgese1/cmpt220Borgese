import java.util.Scanner;

public class ex6_17 {
	public static void printMatrix(int n) {
		int c;
		int r;
		  for (r = 0; r < n; r++) {
			  for (c = 0; c < n; c++) {
	                System.out.printf("%3d ", (int)(Math.random() * 2));
	            }
	            System.out.println();
		  }
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = keyboard.nextInt();
		printMatrix(n);
	}
}

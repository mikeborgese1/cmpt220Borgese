import java.util.Scanner;

public class ex5_16 {
	public static void main(String[] args) {
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Enter an integer to be factored:");
		int num = keyboard.nextInt();
		int div = 2;
		
		while (num /div != 1) {
			if (num % div ==0 ) {
				System.out.print(div + ", ");
				num /= div; 
			}
			else
				div++; 
		}
		System.out.println(num);
			
		
	}
}

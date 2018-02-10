import java.util.Scanner;

public class ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0:");
		int pos= 0;
		int neg= 0;
		int nums= 0;
		int sum= 0;
		int num= keyboard.nextInt();
		
		if (num == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}
		while(num != 0) {
			if(num>0) {
				pos++;
				nums++;
			}
			else {
				neg++;
				nums++;
			}
			sum+=num;
			num = keyboard.nextInt();
		}
		double average= sum/nums;
		
		
		System.out.println("The number of positives is "+pos);
		System.out.println("The number of negatives is "+neg);
		System.out.println("The total is "+sum);
		System.out.println("The average is "+average);
	}

}

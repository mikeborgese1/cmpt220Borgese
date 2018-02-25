import java.util.Scanner;

public class ex8_11 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double array[][]= new double [3] [3];
		System.out.println("Enter a number between 0 and 511");
		int a=keyboard.nextInt();
		int[] nums = new int[9];
		
		  for (int i = nums.length-1;i>=0 && a >0;i--)
		  {
		    if ( a % 2 == 0)
		      nums[i] = 0;
		    else
		      nums[i] = 1;
		    a /= 2;
		  }
		  for (int i = 0; i<9;i++){
			  if (nums[i] == 0) {
				  System.out.print("H ");
			  }
			  else {
				  System.out.print("T ");
			  }
			  if ((i+1) % 3 == 0) System.out.println();

		 }
}}

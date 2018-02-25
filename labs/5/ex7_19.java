import java.util.Scanner;

public class ex7_19 {
	public static boolean isSorted(int[] list) {
		 int j = list.length - 1;
		  boolean isSorted = true;
		 
		  for (int i = 0; i < j; i++) {
		   if (list[i] > list[i + 1]) {
		    isSorted = false;
		    break;
		   }
		  }
		 
		  return isSorted;
		 
	}
		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			
			
			System.out.print("Enter the size of the list:");
			int size = keyboard.nextInt();
			int[] nums = new int[size];
			System.out.print("Enter the contents of the list:");
				for (int i = 0; i < nums.length; i++) {
					 nums[i] = keyboard.nextInt();
				}
				System.out.println("The list has "+ size+ " integers "+  nums.toString());
				if (isSorted(nums)==true) {
					System.out.println("The list is already sorted");
				}
				else {
					System.out.println("The list is not sorted");
				}
	}
	
}

import java.util.Scanner;

public class es18_13 {
	public static void main(String[] args) { 
		Scanner keyboard = new Scanner(System.in);
		 System.out.print("Enter the amount of integers you want to compare integers: ");
	     int num= keyboard.nextInt();
        int[] a = new int[num];
       
        System.out.println("Enter "+num+" integers: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = keyboard.nextInt();
        }
        System.out.println("The largest integer is " + max(a));

    }
	private static int max(int[] a, int i, int max) {
	
	        if (i == a.length) {
	            return max;
	        }
	        else if (max < a[i]) {
	            max = a[i];
	        }
	        return max(a, i + 1, max);
	}
    private static int max(int[] a) {

        return max(a, 0, a[0]);
    }

    

}

import java.util.Scanner;

public class ex6_3 {
	public static int reverse(int number) {
		String hold = ""; 
		String n = number + ""; 
		
		for (int i = n.length() - 1; i >= 0; i--) {
			hold += n.charAt(i);
		}
		return Integer.parseInt(hold);
	}
	
	public static boolean isPalindrome(int number) {
		if (number == reverse(number)){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Enter an integer to see if it is a Palindrome:");
		int number = keyboard.nextInt();
		
		if (isPalindrome(number) == true ) {
			System.out.println("The number "+ number+ " is a palindrome");
		}
		else {
			System.out.println("The number "+ number+ " is not a palindrome");
		}
		
		
	}

}

import java.util.Scanner;

public class ex18_11 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string to have it reversed:  ");
		String reverse = keyboard.nextLine();
		
		reverse(reverse);
		
		
		}
	public static void reverse(String s) {
		if(s.isEmpty()) {
			return;
		}
		else {
			System.out.println(s.charAt(s.length() -1));
			reverse(s.substring(0, s.length()-1));
		}
	}
	
	}

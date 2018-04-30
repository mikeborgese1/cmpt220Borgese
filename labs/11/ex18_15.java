import java.util.Scanner;

public class ex18_15 {
	public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = keyboard.nextLine();
        System.out.print("Enter a character to see how many times it occurs in the string: ");
        char a = keyboard.next().charAt(0);
        System.out.println(a+ "occurs"+ count(str, a)+ "times");

    }
  public static int count(String str, char a, int high) {
  		 int n =  (a == str.charAt(0)) ? 1 : 0;
		 if (high <= 0) {
		     return n;
		 }
		 return n + count(str.substring(1), a, high - 1);
	 }
    public static int count(String str, char a) {
        return count(str, a, str.length() - 1);
    }

   
}

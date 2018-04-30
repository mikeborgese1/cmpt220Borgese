import java.util.Scanner;

public class ex18_17 {
	public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = keyboard.nextLine();
        System.out.print("Enter a character to see how many times it occurs in the strign: ");
       
        char a = keyboard.next().charAt(0);
        //System.out.println(count(chars, a));
        char[] chars = str.replaceAll(" ", "").toCharArray();
        System.out.println(a+ "occurs"+ count(chars, a)+ "times");
    }
  public static int count(char[] chars, char a, int high) {
	  int count = (chars[high] == a) ? 1 : 0;

      if (high == 0) {
          return count;
      }
      else {
          return count + count(chars, a, high - 1);
      }
  }
    public static int count(char[] chars, char a) {
        return count(chars, a, chars.length - 1);
    }

   
}

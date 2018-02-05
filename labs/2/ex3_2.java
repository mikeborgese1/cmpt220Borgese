import java.util.*;

public class ex3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();

		int  a = rand.nextInt(9) + 1;
		int  b = rand.nextInt(9) + 1;
		int  c = rand.nextInt(9) + 1;
		
		System.out.println( "What is " + a+ " + " + b +" + "+c+ "? ");
		Scanner keyboard  = new Scanner(System.in);
		int ans= keyboard.nextInt();
		int realAns = a+b+c;
		 System.out.println(a + " + " + b +  " + "+ c+ " = " + ans+ " is "+(realAns == ans));
		
	}

}

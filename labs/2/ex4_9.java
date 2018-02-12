import java.util.*;
public class ex4_9 {
    public static void main(String[] args) {
       
    	//DataInputStream din = new DataInputStream (System.in);
		Scanner input = new Scanner(System.in);

    	System.out.println("Enter a character:");
    	char chara = (char) input.next().charAt(0); // JA
    	int uni = Character.getNumericValue(chara);
    	System.out.println("The Unicode for the character E is"+ uni);
    }
}

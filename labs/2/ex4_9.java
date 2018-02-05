import java.io.*;
public class ex4_9 {
    public static void main(String[] args) {
       
    	DataInputStream din = new DataInputStream (System.in);

    	System.out.println("Enter a character:");
    	char chara = (char) System.in.read();
    	int uni = Character.getNumericValue(chara);
    	System.out.println("The Unicode for the character E is"+ uni);
    }}

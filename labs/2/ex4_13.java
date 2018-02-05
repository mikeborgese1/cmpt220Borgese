import java.util.Scanner;

public class ex4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Enter a letter: ");
	Long letter = keyboard.nextLong();
		letter.toString();
	
		
		if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U'){
		System.out.println(letter+" is a vowel"); 
		}
		else {
			System.out.println(letter+" is a  consonant");
		}
		}
		
	}



import java.util.Random;
import java.util.Scanner;

public class ex3_17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("scissor (0), rock (1), paper (2): ");
		int user = keyboard.nextInt();
		Random rand = new Random();
		int  comp = rand.nextInt(2) ;
		String rps;
		String result;
		if (user == 0) {
			rps = "Scissor";
		}
		else if (user ==1) {
			rps = "Rock";
		}
		else if (user ==2){
		rps = "Paper";
		}
		if (comp == 0) {
			rps = "Scissor";
		}
		else if (comp ==1) {
			rps = "Rock";
		}
		else if (comp==2){
		rps = "Paper";
		}	 
		if (user > comp) {
			result = "You Won";
			
		}
		else if (user < comp) {
			result = "You lost";
		}
		else {
			result = "You tied";
		}
		
		System.out.println("The computer is"+comp+". You are "+ user +  result);
		
}
}

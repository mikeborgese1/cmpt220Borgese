import java.util.*;

public class a1 {

  Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    double tapeam = 0;
    int next = 1;
    int[] pages = new int[n];
    for (int i = 1; i < n; i++)
      pages[i] = keyboard.nextInt();
    double[] tape = new double[n]; 
    for (int i = 1; i < n; i++) 
      tape[i] = ((-1-(i*2))/4)*((-1-(i*2))/4);

    for (int i = 0; i < n; i++) {
      tapeam += tape[i] * (next / 2);
      	if (pages[i] < next) {
      		next = (next - pages[i]) * 2;
      		
      	}
      	
      	else {
      		next = 0;
            break;
      	}
    	}
    if (next > 0) {
      System.out.println("impossible");
    }
    else
      System.out.println(tapeam);
  }

}
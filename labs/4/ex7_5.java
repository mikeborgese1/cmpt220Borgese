import java.util.Scanner;

public class ex7_5 {
	 public static boolean distinct(int[] numbers, int n) {

	        for (int i : numbers){
	            if (n == i) return false;
	        }
	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		 System.out.println("Enter ten numbers:");
		int [] num = new int[10];
		for(int i = 0 ; i < num.length ; i++){
           num[i] = keyboard.nextInt();
		}
		int place = 0;
		for (int i = 0; i < num.length; i++) {
            int numb = keyboard.nextInt();

            if (distinct(num, numb)) {
                num[place++] = numb;
            }
        }
        System.out.println("The number of distinct number is " + place);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < place; i++) {
            System.out.print(num[i] + " ");
        }
    }

   
	}



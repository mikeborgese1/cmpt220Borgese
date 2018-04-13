import java.util.Scanner;
	public class ex12_3 {


	    public static void main(String[] args) {

	        
	        int[] array = new int[100];
	        for (int i = 0; i < array.length; i++) {
	            array[i] = (int) (Math.random() * 100);
	        }
	        Scanner keyboard = new Scanner(System.in);
	        System.out.print("Enter an index: ");
	        try {
	            int num = keyboard.nextInt();
	            System.out.println("array[" + num + "] = " + array[num]);
	        } catch (IndexOutOfBoundsException d) {
	            System.out.println("INDEX " + d.getLocalizedMessage() + " is out of bounds");
	        } catch (Exception d) {
	            System.out.println("INVALID INPUT");
	        }
	    }
	}


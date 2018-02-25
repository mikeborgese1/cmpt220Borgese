import java.util.Scanner;

public class ex8_1 {
	public static double sumColumn(double[][] m, int columnIndex) {
		  double b = 0;
		  for (int row = 0; row < m.length; row++) {
		   b += m[row][columnIndex];
		  }
		  return b;
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	double array[][]= new double [3] [4];
	 System.out.println("Enter a 3-by-4 matrix row by row: ");
	 
	 
	  for (int a = 0; a < array.length; a++) {
	   for (int b = 0; b < array[a].length; b++) {
	    array[a][b] = keyboard.nextDouble();
	   }
	  }
	 

	   System.out.println("Sum of the elements at column 0 is " + sumColumn(array, 0));
	   System.out.println("Sum of the elements at column 0 is " + sumColumn(array, 1));
	   System.out.println("Sum of the elements at column 0 is " + sumColumn(array, 2));
	   System.out.println("Sum of the elements at column 0 is " + sumColumn(array, 3));
	 
		
	}
}

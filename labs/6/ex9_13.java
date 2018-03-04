import java.util.Scanner;

public class ex9_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int r = keyboard.nextInt();
        int c = keyboard.nextInt();
        double[][] m = new double[r][c];

        System.out.println("Enter the array:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = keyboard.nextDouble();
            }
        }

        Location location = Location.locateLargest(m);

        System.out.println("The location of the largest element is "
                + location.maxValue + " at (" + location.row + ", " + location.column + ")");
		// JA: These are called r, c, max in your class
	}

}

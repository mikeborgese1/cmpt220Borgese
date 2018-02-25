import java.util.Scanner;

public class ex8_5 {
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] result = new double[b.length][a[0].length];
		 
		  for (int i = 0; i < result.length; i++) {
		   for (int j = 0; j < result[0].length; j++) {
		    result[i][j] = a[i][j] + b[i][j];
		   }
		 
		  }
		 
		  return result;
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double array[][]= new double [3] [3];
		double[][] arrayb = new double[3][3];
		  double[][] result;
		 
		 System.out.println("Enter matrix 1: ");
		 
		 
		  for (int a = 0; a < array.length; a++) {
		   for (int b = 0; b < array[a].length; b++) {
		    array[a][b] = keyboard.nextDouble();
		    
		   }
		   }
		    
		    System.out.println("Enter matrix 2: ");
			
			  for (int c = 0; c < arrayb.length;c++) {
			   for (int d = 0; d < arrayb[d].length; d++) {
			    arrayb[c][d] = keyboard.nextDouble();
		    
		   }
		  }
			  result = addMatrix(array, arrayb);
			  for (int i = 0; i < result.length; i++) {
				   for (int j = 0; j < result[0].length; j++) {
				 
				    System.out.print(array[i][j] + " ");
				    if (i == 1 && j == 2) {
				     System.out.print(" + ");
				    } 
				    
				    else {
				     System.out.print("   ");
				    }
				   }
				   
				   for (int j = 0; j < result[0].length; j++) {
				    System.out.print(arrayb[i][j] + " ");
				    if (i == 1 && j == 2) {
				     System.out.print(" = ");
				    } 
				    else {
				     System.out.print("   ");
				    }
				   }
				   
				   for (int j = 0; j < result[0].length; j++) {
				    System.out.print(result[i][j] + " ");
				   }
				   System.out.println();
	}}
}

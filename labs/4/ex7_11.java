import java.util.Scanner;

public class ex7_11 {
	public static double mean (double[] x) {
		double add=0;
		double mean=0 ;
		for (int i =0; i<x.length; i++) {
			add+=x[i];
		}
		mean = add/(x.length);
		return mean;
	}
	public static double deviation (double[] x) {
		double a = 0;
		double b=0;
		double c= 0;
		double mean = mean(x);
		for (int i =0; i<x.length; i++) {
			a= ((x[i] - mean)*(x[i] - mean));
			b= x.length - 1;
			c = Math.sqrt(a/b);
		}
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		 System.out.println("Enter ten numbers:");
		double [] num = new double[10];
			for(int i = 0 ; i < num.length ; i++){
				num[i] = keyboard.nextInt();
          
           //System.out.println("The standard deviation is "+ min(num));
			
			}
		 System.out.println("The mean is "+ mean(num));
		 System.out.println("The standard deviation is "+ deviation(num));
	}

}

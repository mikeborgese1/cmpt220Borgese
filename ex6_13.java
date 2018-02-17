
public class ex6_13 {
	public static double m( double c) {
		double b = 0;
		for (double i =	1 ;i <= c; i++ ){
			 b+= i/(i+1);
		}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.printf("%4.4s","i");
		 System.out.print("\t|\t");
		 System.out.printf("%-11.1s\n","m(i)");
		 
		 
		 for (double  i = 1.0  ; i <= 20.0; i++ ) {
		 System.out.printf("%4.3f", i);
		   System.out.print("\t|\t");
		   System.out.printf("%-11.1f\n", m(i));
		 }
	}
		 
}

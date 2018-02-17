
public class ex6_9 {
	/** Convert from feet to meters */
	public static double footToMeter(double foot) {
		
		 return 0.305 * foot;
	}

	/** Convert from meters to feet */
	public static double meterToFoot(double meter) {
		
		return 3.279 * meter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.printf("%-9s%15s","Feet","Meters");
		  System.out.print("\t|\t");
		  System.out.printf("%-9s%15s\n","Meters","Feet");
		  
		  for (double  i = 1.0 ,a=20.0 ; i <= 10.0; i++, a+=5) {
			   System.out.printf("%4.3f\t\t%6.3f", i, footToMeter(i));
			   System.out.print("\t|\t");
			   System.out.printf("%-11.1f\t%6f\n",a,meterToFoot(a));
		  }
	}

}


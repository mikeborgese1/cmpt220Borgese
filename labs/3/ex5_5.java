import java.util.*;
public class ex5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int fin = 199;
		  final int lbs = 20;
		 
		  // printing table header
		  System.out.printf("%-9s%15s","Kilograms","Pounds");
		  System.out.print("\t|\t");
		  System.out.printf("%-9s%15s\n","Pounds","Kilograms");
		 
		  for (int a=0, i = 1; i <= fin; i+=2, a+=5) {
		   System.out.printf("%-9d%15.1f", i, i * 2.2);
		   System.out.print("\t|\t");
		   System.out.printf("%-9d%15.1f\n",lbs+a,(lbs+a)/2.2);
		 
		  
	}

}}


public class ex5_13 {
	public static void main(String[] args) {
		int n= 0;
		while ((n*n*n)<1200) {
			n++;
			}
			
		int m=n;
		n= n-1;
		int n3 = n*n*n;
		int m3= m*m*m;
		System.out.println("The largest possible value for N, so that n cubed is less that 1200 is "+n+".") ;
		System.out.println("because " +n+" cubed is "+ n3 + " and "+ m + " cubed is " +m3 +".");
	
		
	}
}


public class ex6_1 {
	public static int getPentagonalNumber(int n) {
		return (n*((n*3)-1))/2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        for (int a = 1; a <= 100; a++){
            System.out.printf("%7d ", getPentagonalNumber(a) );
            
            
           
            
        }
	}

}
import java.util.Scanner;

public class ex7_3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	    	 
	    	  int amount = 0;
	    	  int[] num = new int[10];
	        System.out.println("Enter ten integers between 1 and 100");
	            for(int i = 0 ; i < num.length ; i++){
	              num[i] = keyboard.nextInt();
	          if(num[i] == 0)
	              break;
	            }
	      for(int i = 0 ; i <num.length ; i++ )
	      {
	          for(int j = 0 ; j > i ; j++)
	          {
	              if(num[i] == num[j])
	                  amount++;
	             }
	         for( i = 0 ; i < num.length ; i++)
	        	 
	       System.out.println(num[i] + " occurs " + amount + " times ");
	       
	      
	}
}
}
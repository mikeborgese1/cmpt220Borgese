
public class ex10_3 {
	public static void main(String[] args) {
		  myInteger num1 = new myInteger(8);
	        myInteger num2 = new myInteger(3);
	        myInteger num3 = new myInteger(39);

	        System.out.println("Number 1 = "+ num1.getValue() +"isPrime: " + num1.isPrime()+"%b isOdd:"+num1.isOdd()+" isEven:"+num1.isEven() +"\n");
	        System.out.println("Number 2 = "+ num2.getValue() +"isPrime: " + num2.isPrime()+"%b isOdd:"+num2.isOdd()+" isEven:"+num2.isEven() +"\n");
	        System.out.println("Number 3 = "+ num3.getValue() +"isPrime: " + num3.isPrime()+"%b isOdd:"+num3.isOdd()+" isEven:"+num3.isEven() +"\n");
	        System.out.printf("Number 2 = %d isPrime: %b isOdd: %b isEven %b\n",
	                num2.getValue(), num2.isPrime(), num2.isOdd(), num2.isEven());
	        System.out.printf("Number 3 = %d isPrime: %b isOdd: %b isEven %b\n",
	                num3.getValue(), num3.isPrime(), num3.isOdd(), num3.isEven());

	        System.out.printf("Num 1 == Num 2: ",num1.equals(num2));
	        System.out.printf("Num 1 == Num 3: %b\n",num1.equals(num3));
	        System.out.printf("Parse int 102 string value == %d\n",myInteger.parseInt("102"));
	        System.out.printf("Parse int 169 char array value == ",myInteger.parseInt("169".toCharArray()));
/*
 * 			MyInteger
 * +value:int
 * MyIneger(value:int)
 * +getValue();Int
 * isEven(): boolean
 * isOdd(): boolean
 * isPrime(): boolean
 * +parseInt(str:String)
 * 
 * 
 * 
 * */
	}
}

import java.util.Scanner;

public class ex4_23 {
	public static void main(String[] args) {
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Enter employee’s name: ");
		String name= keyboard.nextLine();
		System.out.println("Enter number of hours worked in a week:: ");
		int hours = keyboard.nextInt();
		System.out.println("Enter hourly pay rate:: ");
		float rate = keyboard.nextFloat();
		System.out.println("Enter federal tax withholding rate:: ");
		float fed = keyboard.nextFloat();
		System.out.println("Enter state tax withholding rate:: ");
		float state = keyboard.nextFloat();
		
		float fedPerc = fed*100;
		float statePerc = state*100;
		
		float gross= (hours*rate);
		float fedAm = fed*gross;
		float stateAm = state*gross;
		float totded= fedAm+stateAm;
		float netPay = gross- totded;
		
		System.out.println("Employee Name: "+name);
		System.out.println("Hours Worked: "+hours);
		System.out.println("Pay Rate: $"+rate);
		System.out.println("Gross Pay: $"+gross);
		System.out.println("Decuctions: "); 
		System.out.println("Federal Withholding ("+ fedPerc+"%): "+fedAm); 
		System.out.println("State Withholding ("+ statePerc+"%): "+stateAm); 
		System.out.println("Total Deduction: $"+totded); 
		System.out.println("Net Pay: $"+netPay); 
		
		
		
		

		
}
}
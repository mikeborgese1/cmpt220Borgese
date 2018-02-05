import java.util.Scanner;

public class ex3_11good {

	public static void main(String[] args) {
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Enter a month and a year: ");
		int monthNum = keyboard.nextInt();
		int year= keyboard.nextInt();
		int days;
		String month;
		if (monthNum ==1) {
			month = "January";
			days = 31;
		}
		else if (monthNum ==2) {
			month = "February";
			days = 28;
		}
		else if (monthNum ==3) {
			month = "March";
			days = 31;
		}
		else if (monthNum ==4) {
			month = "April";
			days = 30;
		}
		else if (monthNum ==5) {
			month = "May";
			days = 31;
		}
		else if (monthNum ==6) {
			month = "June";
			days = 30;
		}
		else if (monthNum ==7) {
			month = "July";
			days = 31;
		}
		else if (monthNum ==8) {
			month = "August";
			days = 31;
		}
		else if (monthNum ==9) {
			month = "September";
			days = 30;
		}
		else if (monthNum ==10) {
			month = "October";
			days = 31;
		}
		else if (monthNum ==11) {
			month = "November";
			days = 30;
		}
		else {
			month = "December";
			days = 31;
		}
		System.out.println(month + " "+year +"has " + days +"days.");
		
		
		
		
		
	}
}


import java.util.Scanner;

public class ex3_5 {
	public static void main(String[] args) {
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Enter today’s day: ");
		int today= keyboard.nextInt();
		System.out.println("Enter the number of days elapsed since today: ");
		int ahead= keyboard.nextInt();
		String day1 = null;
		switch(today){
        case 0: day1 = "Sunday";
                break;
        case 1: day1= "Monday";
                break; 
        case 2: day1 = "Tuesday";
                break;
        case 3:day1 = "Wednesday";
                break;
        case 4: day1 = "Thursday";
               break;
        case 5: day1 = "Friday";
                break;
        case 6: day1 = "Saturday";
                break;
		}

    if (ahead == 0){
        System.out.printf("Todays is"+day1+" and the future day is Sunday");
    }else if(ahead == 1){
        System.out.printf("Todays is"+day1+" and the future day is Monday" );
    }else if(ahead == 2){
        System.out.printf("Todays is"+day1+" and the future day is  Tuesday");
    }else if(ahead == 3){
        System.out.printf("Todays is"+day1+" and the future day is Wednesday");
    }else if(ahead == 4){
        System.out.printf("Todays is"+day1+" and the future day is Thursday");
    }else if(ahead == 5){
        System.out.printf("Todays is"+day1+" and the future day is Friday");
    }else if(ahead == 6){
        System.out.printf("Todays is"+day1+" and the future day is Saturday");
    }
	}
}

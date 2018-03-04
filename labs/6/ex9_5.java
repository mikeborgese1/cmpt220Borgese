import java.util.*;


public class ex9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.toString());
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(1234567898765L);
      int year = cal.get(Calendar.YEAR);
      int  month = cal.get(Calendar.MONTH);
      int day= cal.get(Calendar.DATE);       
      System.out.println("Year: " +year +", Month: "+month+", Day: " +day);
      		

		
	}

}

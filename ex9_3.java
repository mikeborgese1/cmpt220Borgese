import java.util.Date;

public class ex9_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date;
		long time = 10000;
		int i = 0;
		while ( i <= 7) {
			date = new Date(time);
			System.out.println(date.toString());
			i++;
			time = time*10;
		}
	}
}


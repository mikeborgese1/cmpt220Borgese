import java.util.ArrayList;
import java.util.Random;
public class ex133 {
	public static void main(String[] args) {
		 ArrayList<Number> list = new ArrayList<Number>();
		  for (int i = 0; i < 5; i++) {
			  Random rand = new Random(); 
			  int value = rand.nextInt(50);
			  list.add(value);
		}
	
    System.out.println("Original Array List: " + list.toString());
    sort(list);
    System.out.println("Sorted Array List: " + list.toString());

	}
public static void sort (ArrayList <Number> list) {
	 for (int i = 0; i < list.size() - 1; i++) {
         Number min = list.get(i);
         int index = i;

         int j ;
         for (  j= i+1 ; j < list.size(); j++) {
             if (  min.doubleValue()>list.get(j).doubleValue()) {
                 min = list.get(j);
                 index = j;
             }
         }

         if (index != i) {
             list.set(index, list.get(i));
             list.set(i, min);
         }
	 }
}
}

import java.util.Scanner;
	 
public class ex8_7 {
	 public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
	  return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)+ (z2 - z1) * (z2 - z1));
	 }
	 public static void main(String[] args) {
	  int a = 0;
	  int  b= 1; 
	  double[][] x = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};
	  double shortest = distance(x[a][0], x[a][1],
	    x[a][2], x[b][0], x[b][1], x[b][2]); 
	  for (int i = 0; i < x.length; i++) {
	   for (int j = i + 1; j < x.length; j++) {
	    double dist = distance(x[i][0], x[i][1],
	      x[i][2], x[j][0], x[j][1], x[j][2]); 
	    if (shortest > dist) {
	     a = i; 
	     b = j; 
	     shortest = dist; 
	    }
	   }
	  }
	  System.out.println("The closest two points are " + "(" + x[a][0] + ", " + x[a][1] + ", " + x[a][2] + ") and (" + x[b][0] + ", " + x[b][1] + ", " + x[b][2]+ ")");
	 } 
}

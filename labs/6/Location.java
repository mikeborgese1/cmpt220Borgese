
public class Location {
	 public int r;
	    public int c;
	    public double max;

	    public Location(int r, int c, double max) {
	        this.r = r;
	        this.c = c;
	        this.max = max;
	    }

	    public static Location locateLargest(double[][] a) {

	        int r = 0;
	        int c = 0;
	        double max = a[r][c];

	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[i].length; j++) {
	                if (max < a[i][j]) {
	                    max = a[i][j];
	                    r = i;
	                    c = j;
	                }
	            }
	        }

	        return new Location(r,c,max);
}
}
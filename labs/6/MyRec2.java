
public class MyRec2 {
	

	    private double w;
	    private double h;

	    public MyRec2() {
	        this.w = 1.0;
	        this.h = 1.0;
	    }

	    public MyRec2(double w, double h) {
	        this.w = w;
	        this.h = h;
	    }

	    /** return area **/
	    public double getAr() {
	        return this.w * this.h;
	    }
	   
	    public double getPer() {
	        return this.w * 2 + this.h * 2;
	    }

	}


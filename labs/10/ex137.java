
public class ex137 {
	// JA: Where is the main method?
	GeometricObject[] geoShapes = new GeometricObject[5];
	geoShapes[0] = new MyRectangle2D();
	geoShapes[1] = new Circle2D();
	geoShapes[2] = new Square();
	geoShapes[3] = new MyRectangle2D(0, 0, 10, 5);
	geoShapes[4] = new Square(0,0,25);

	for (int i = 0; i < geoShapes.length; i++) {

		System.out.println("shape #" + (i + 1) + " area = " + geoShapes[i].getArea());
		if (geoShapes[i] instanceof Colorable) {
			System.out.println("How to color: "+((Colorable)geoShapes[i]).howToColor());
		}
	}

}

class Square extends GeometricObject implements Colorable {

	private double x;
	private double y;
	private double side;

	public Square() {
	    this(0,0,10);
	}

	 public Square(double x, double y, double side) {
	    this.x = x;
	    this.y = y;
	    this.side = side;
	}

	@Override
	public double getArea() {
	    return side * side;
	}

	@Override
	public double getPerimeter() {
	    return side * 4;
	}

	@Override
	public String howToColor() {
	    return "Color all four sides.";
	}

	public double getX() {
	    return x;
	}

	public void setX(double x) {
	    this.x = x;
	}

	public double getY() {
	    return y;
	}

	public void setY(double y) {
	    this.y = y;
	}

	public double getSide() {
	    return side;
	}

	public void setSide(double side) {
	    this.side = side;
	}
}

interface Colorable {
	String howToColor();
}



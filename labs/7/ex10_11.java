// JA: Where is the Circle2D class defined?
public class ex10_11 {
	  public static void main(String[] args) {

		  /*
		   * Circle 2D
		   * 
		   * -x:double
		   * -y:double
		   * -radius:double
		   * +Circle2D()
		   * +Circle2D(x:double y:double radius:double)
		   * +getX();double
		   * +getY();double
		   * +getRadius();double
		   * +getArea();double
		   * +getPerimeter();double
		   * +contains(x:double y:double ): boolean
		   * +contains(Circle2D: circle ): boolean
		   * +overlaps(Circle2D: circle ): boolean
		   * */


			        Circle2D c1 = new Circle2D(2, 2, 5.5);

			        System.out.println("C1 area = " + c1.getArea() + " perimeter = " + c1.getPerimeter());
			        System.out.println("Does c1 contain coordinate (3,3)? " + c1.contains(3, 3));
			        System.out.println("Does c1 contain circle 2? " + c1.contains(new Circle2D(4, 5, 10.5)));
			        System.out.println("Does c1 overlap circle 3? " + c1.overlaps(new Circle2D(3, 5, 2.3)));

			    }

}


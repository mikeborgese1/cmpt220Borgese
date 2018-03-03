
public class ex9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MyRec2[] rect = new MyRec2[2];
	rect[0] = new MyRec2(4,40);
	rect[1] = new MyRec2(3.5, 35.9);


    System.out.println("MyRec2 " + (1) +":");
    System.out.print("Area = " + rect[0].getAr());
    System.out.println(" Perimeter = " +  rect[0].getPer() +"\n");
    
    System.out.println("MyRec2 " + (2) +":");
    System.out.print("Area = " + rect[1].getAr());
    System.out.println(" Perimeter = " +  rect[1].getPer() );
    


	}

}

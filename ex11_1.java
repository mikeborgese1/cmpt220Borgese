import java.util.Scanner;
public class ex11_1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter three sides of a triangle: ");
        double[] num = new double[3];
        for (int i = 0; i < num.length; i++) num[i] = keyboard.nextDouble();
        System.out.print("Enter a triangle color: ");
        String color = keyboard.next();
        System.out.print("Is the triangle filled? true/false: ");
        String isFilledString = keyboard.next();
        boolean isFilled = (isFilledString.equals("true"));

        Triangle t1 = null;
        try {
            t1 = new Triangle(num[0], num[1], num[2]);
            t1.setColor(color);
            t1.setFilled(isFilled);
            System.out.println("Triangle 1:");
            System.out.println("Area = " + t1.getArea());
            System.out.println("Perimeter = " + t1.getPerimeter());
            System.out.println("Color = " + t1.getColor());
            System.out.println("Is filled? " + t1.isFilled());

        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}

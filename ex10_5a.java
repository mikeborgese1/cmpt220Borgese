import java.util.Scanner;

public class ex10_5a {
	public static void main(String[] args) {

        System.out.print("Enter a positive integer: ");
        int num = new Scanner(System.in).nextInt();

        StackOfIntegers stack = new StackOfIntegers(20);

        int fact = 2;
        while (fact <= num) {
            if (num % fact == 0) {
                stack.push(fact);
                num /= fact;
            } else {
                fact++;
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }


    }
}

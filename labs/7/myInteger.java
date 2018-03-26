
public class myInteger {
    private int value;

    public myInteger(int val){
        this.value = val;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
        double range = Math.sqrt(value);
        for (int i = 2; i < range; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    public static boolean isPrime(int value) {
        double range = Math.sqrt(value);

        for (int i = 2; i < range; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(myInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(myInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(myInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(myInteger myInteger) {
        return this.value == myInteger.value;
    }

    public static int parseInt(char[] value) {

        double val = 0;
        int power = value.length - 1;
        for (char aValue : value) {

            val += Math.pow(10,power--) * (aValue - '0');
        }

        return (int)val;
    }

    public static int parseInt(String value) {

        return myInteger.parseInt(value.toCharArray());
    }
}

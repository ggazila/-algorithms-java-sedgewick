package chapter1;

public class NumberManipulation {
    public static void main(String[] args) {
        int x = 5;
        double d = 25;
        double d2 = 5;
        System.out.println(abs(x));
        System.out.println(isPrime(x));
        System.out.println(squareRoot(d));
        System.out.println(hypotenuse(d, d2));
        System.out.println(harmonicNumber(x));
    }

    private static double harmonicNumber(int x) {
        double sum = 0.0;

        for (int i = 1; i <= x; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }

    private static double hypotenuse(double d, double d2) {
        return Math.sqrt(d * d + d2 * d2);
    }

    private static double squareRoot(double c) {
        if (c == 0) {
            return Double.NaN;
        }

        double err = 1e-15;
        double t = c;

        while (Math.abs(t - c / t) > err * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }

    private static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }

        for (int i = 2; i * i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int abs(int x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }
}

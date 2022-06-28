import java.util.stream.IntStream;

public class StrongNumber {
    public static String isStrongNumber(int num) {
        int res = 0;
        int temp = num;
        while (temp > 0) {
            res += factorial(temp % 10);
            temp /= 10;
        }
        return res == num ? "STRONG!!!!" : "Not Strong !!";
    }

    private static int factorial(int num) {
        return IntStream.rangeClosed(1, num).reduce(1, (a, b) -> a * b);
    }
}
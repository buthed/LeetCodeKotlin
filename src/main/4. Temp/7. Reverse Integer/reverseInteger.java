import java.util.HashSet;

public class reverseInteger {
    public static void main(String[] args) {
        int x1 = 123;
        int x2 = -123;
        int x3 = 120;

        System.out.println(reverse(x1)); // Output: 321
        System.out.println(reverse(x2)); // Output: -321
        System.out.println(reverse(x3)); // Output: 21
    }

    public static int reverse(int x) {
        int result = 0;
        int resultLength = 0;
        if (x<0) resultLength = String.valueOf(x*-1).length();
        else resultLength = String.valueOf(x).length();
        for (int i = 1; i == resultLength; i++) {
            result+=
        }

    }
}
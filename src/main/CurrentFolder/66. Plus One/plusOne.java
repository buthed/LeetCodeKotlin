import java.util.*;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {9,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        digits[digits.length-1]+=1;

        for (int i = digits.length-1; i >0 ; i--) {
            if (digits[i]==10) {
                digits[i]=0;
                digits[i-1]+=1;
            } else {
                return digits;
            }
        }

        if (digits[0]!=10) {
            return digits;
        }
        else {
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for (int i = 1; i < result.length-1; i++) {
                result[i]=0;
            }
            return result;
        }
    }
}

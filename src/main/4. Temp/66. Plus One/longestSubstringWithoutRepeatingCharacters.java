import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class longestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        int[] digits  =  {9,8,7,6,5,4,3,2,1,0};

        System.out.println(plusOne(digits));
    }

    public static int plusOne(int[] digits) {
//        String resultString = "";
//        for (int i = 0; i < digits.length; i++) {
//            resultString = resultString +digits[i];
//        }
//        int[] resultArr = new int[resultString.length()];
//        for (int i = 0; i < resultString.length(); i++) {
//            resultArr[i] = resultString.charAt(i)-'0';
//        }
        Integer result = 0;
        for (int i = digits.length-1, j = 1; i > 0; i--, j=j*10) {
            result = result + digits[i]*j;
        }

//        resultString = Integer.toString(resultInt);
//        int[] result = new int[resultString.length()];
//        for (int i = 0; i < resultString.length(); i++) {
//            result[i] = resultString.charAt(i)-'0';
//        }

        return result;
    }
}

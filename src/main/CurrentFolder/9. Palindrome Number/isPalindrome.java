import java.util.Arrays;

public class isPalindrome {
    public static void main(String[] args) {
        int x = 12121;
        boolean result;
        result = isPalindrome(x);
        System.out.println(result);
    }
    public static boolean isPalindrome(int x) {
        if (x>= 0) {
            String xAsString = Integer.toString(x);
            int[] arr = new int[xAsString.length()];
            for (int i = 0; i < xAsString.length(); i++) {
                arr[i] = xAsString.charAt(i);
            }
            for (int i = 0,j = arr.length-1; i < arr.length/2+1; i++, j--) {
                if(arr[i] != arr[j]) return false;
            }
            return true;
        } return false;
    }
}

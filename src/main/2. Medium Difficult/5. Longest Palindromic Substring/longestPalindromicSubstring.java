import java.util.Stack;

public class longestPalindromicSubstring {
    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "cbbd";
        String s3 = "cbbdab";
        String s4 = "a";
        String s5 = "bb";
        String s6 = "ccc";
        String s7 = "dddd";
        String s8 = "abcbe";
        System.out.println(longestPalindrome(s1)); // Output: "bab" / "aba"
        System.out.println(longestPalindrome(s2)); // Output: "bb"
        System.out.println(longestPalindrome(s3)); // Output: "bb"
        System.out.println(longestPalindrome(s4)); // Output: "a"
        System.out.println(longestPalindrome(s5)); // Output: "bb"
        System.out.println(longestPalindrome(s6)); // Output: "ccc"
        System.out.println(longestPalindrome(s7)); // Output: "dddd"
        System.out.println(longestPalindrome(s8)); // Output: "bcb"
    }
    public static String longestPalindrome(String s) {
        String result = String.valueOf(s.charAt(0));
        int start = 0;
        int size = 0;

        for (int i = 1; i < s.length()-1; i++) {
            int left = i;
            int right = i;
            int sizeTemp = 1;
            while (left<=right) {
                if (s.charAt(left)!= s.charAt(right)) break;
                else {
                    start = left;
                    if (left!=right) sizeTemp+=2;
                    left --;
                    right++;
                    if (left < 0 || right > s.length()-1) break;


                }
            }
            if (sizeTemp>result.length()) {
                size = sizeTemp;
                result = "";
                for (int j = start; j < start+size; j++) {
                    result = result + s.charAt(j);
                }
            }
        }

        for (int i = 0; i < s.length()-1; i++) {
            int left = i;
            int right = i+1;
            int sizeTemp = 2;
            if (s.charAt(left) == s.charAt(right)) {
                while (left<=right) {
                    if (left < 0 || right > s.length()-1) break;
                    if (s.charAt(left)!=s.charAt(right)) break;
                    else {
                        start = left;
                        left --;
                        right++;
                        sizeTemp += 2;
                    }
                }
                sizeTemp = right-left-1;
                if (sizeTemp>result.length()) {
                    size = sizeTemp;
                    result = "";
                    for (int j = start; j < start+size; j++) {
                        result = result + s.charAt(j);
                    }
                }
            }
        }
        return  result;
    }
}



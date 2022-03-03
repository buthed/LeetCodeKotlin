import java.util.*;

public class isSubsequence {
    public static void main(String[] args) {
        String s1 = "abc";
        String t1 = "ahbgdc";
        String s2 = "axc";
        String t2 = "ahbgdc";
        String s3 = "ace";
        String t3 = "abcde";
        String s4 = "aec";
        String t4 = "abcde";
        String s5 = "";
        String t5 = "ahbgdc";
        String s6 = "ahbgdc";
        String t6 = "";
        String s7 = "b";
        String t7 = "abc";


        System.out.println(isSubsequence(s1, t1)); // Output: true
        System.out.println(isSubsequence(s2, t2)); // Output: false
        System.out.println(isSubsequence(s3, t3)); // Output: true
        System.out.println(isSubsequence(s4, t4)); // Output: false
        System.out.println(isSubsequence(s5, t5)); // Output: false
        System.out.println(isSubsequence(s6, t6)); // Output: false
        System.out.println(isSubsequence(s7, t7)); // Output: false
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length()==0 ) return true;
        int position = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(position)==t.charAt(i)) position++;
            if (position==s.length()) break;
        }
        if (position== s.length())         return true;
        else  return false;
    }
}
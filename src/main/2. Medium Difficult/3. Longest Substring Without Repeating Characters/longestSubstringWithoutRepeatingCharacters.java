import java.util.HashSet;

public class longestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left =0;
        int right = 0;
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        while (left <s.length()) {
            if(set.add(s.charAt(left))) {
                left++;
                if (result< set.size()) result = set.size();
            }
            else {
                set.remove(s.charAt(right));
                right++;
            }
        }
        return result;

    }
}

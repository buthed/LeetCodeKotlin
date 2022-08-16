public class firstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";
        String s4 = "a";
        String s5 = "aa";
        System.out.println(firstUniqChar(s1)); // Output: 0
        System.out.println(firstUniqChar(s2)); // Output: 2
        System.out.println(firstUniqChar(s3)); // Output: -1
        System.out.println(firstUniqChar(s4)); // Output: 0
        System.out.println(firstUniqChar(s5)); // Output: -1

    }
    public static int firstUniqChar(String s) {
        int result = -1;
        int qty = 0;
        for (int i = 0; i < s.length(); i++) {
            Character temp = s.charAt(i);
            qty = 0;
            for (int j = 0; j < s.length(); j++) {
                if (temp.equals(s.charAt(j))) qty++;
                if (qty>1) break;
            }
            if (qty==1) {
                result = i;
                break;
            }
        }
        return result;
    }
}



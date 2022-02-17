import java.util.*;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"","b"};
        String[] strs3 = {"c","acc","ccc"};
        System.out.println("1"+longestCommonPrefix(strs1));
        System.out.println("2"+longestCommonPrefix(strs2));
        System.out.println("3"+longestCommonPrefix(strs3));
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        int count =0;
        int checkLength = strs[0].length();
        int resultInt = checkLength;
        if(resultInt<1) return strs[0];
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < strs[0].length(); j++) {
                if (j==strs[0].length() || j==strs[i].length()) break;
                if (strs[i].charAt(j) != strs[0].charAt(j)) {
                    break;
                }
                else {
                    count ++;
                }
            }
            if (count<resultInt) resultInt = count;
            count =0;
        }


        return strs[0].substring(0, resultInt);
    }
}

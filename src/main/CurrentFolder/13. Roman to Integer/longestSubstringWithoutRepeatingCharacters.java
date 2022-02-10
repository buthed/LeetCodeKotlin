import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class longestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int start =0;
        int result= 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);

        for (int i = 0; i < s.length(); i++) {
            if (i==s.length()-1) return result = + result +map.get(s.charAt(i));
            if (map.get(s.charAt(i))<map.get(s.charAt(i+1))) {
                result = result- map.get(s.charAt(i));
            } else {
                result = result+ map.get(s.charAt(i));
            }
        }
        return result;
    }
}

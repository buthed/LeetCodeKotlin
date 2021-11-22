import java.util.Arrays;
import java.util.HashMap;

public class romanToInt {
    public static void main(String[] args) {
        String s = "III";
        Integer result = null;
        System.out.println(result);
    }
    public int romanToInt(String s) {
        HashMap<Integer, String> romanAndInteger = new HashMap<>();
        romanAndInteger.put(1000, "M");
        romanAndInteger.put(500, "D");
        romanAndInteger.put(100, "C");
        romanAndInteger.put(50, "L");
        romanAndInteger.put(10, "X");
        romanAndInteger.put(5, "V");
        romanAndInteger.put(1, "I");

    }
}

import java.util.*;

public class letterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        String digits1  = "23";
        String digits2 = "";
        String digits3 = "2";
        System.out.println("1 - "+letterCombinations(digits1));
        System.out.println("2 - "+letterCombinations(digits2));
        System.out.println("3 - "+letterCombinations(digits3));
    }

    public static List<String> letterCombinations(String digits) {
        ArrayList<String> list = new ArrayList<String>();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrst");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        int listLength = map.get(digits.charAt(0)).length();;
        for (int i = 1; i < digits.length(); i++) {
            listLength = listLength * map.get(digits.charAt(i)).length();

        }
        list.add(String.valueOf(listLength));
        return list;
    }
}

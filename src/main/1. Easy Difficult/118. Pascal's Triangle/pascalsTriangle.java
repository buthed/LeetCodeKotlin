import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
    public static void main(String[] args) {
        int s1 = 5;
        int s2 = 1;


        System.out.println(generate(s1)); // Output: 0
        System.out.println(generate(s2)); // Output: 2

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> topRow = new ArrayList();
        topRow.add(1);
        result.add(topRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> newRow = new ArrayList();
            newRow.add(1);
            for (int j = 0; j < topRow.size()-1; j++) {
                newRow.add(topRow.get(j) + topRow.get(j + 1));
            }
            newRow.add(1);
            result.add(newRow);
            topRow = newRow;
        }

        return result;
    }
}



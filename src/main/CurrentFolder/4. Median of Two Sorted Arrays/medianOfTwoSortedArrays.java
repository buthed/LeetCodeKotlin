import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class medianOfTwoSortedArrays {
    public static void main(String[] args) {
        int num = 0;

        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {
        int numTemp = num;
        int result;
        int tempResult = num;
        int var;
        do{
            numTemp = tempResult;
            int numLength = String.valueOf(numTemp).length();
            int j = (int) Math.pow(10, numLength-1);
            tempResult =0;
            for (int i = 0; i< numLength; i++) {
                var = numTemp/j;
                numTemp = numTemp - var*j;
                tempResult = tempResult +var;
                j=j/10;
            }
            result = tempResult;
        }while (String.valueOf(result).length() != 1);
        return result;
    }
}

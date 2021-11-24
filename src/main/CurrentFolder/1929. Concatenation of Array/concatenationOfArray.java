import java.util.Arrays;
import java.util.HashMap;

public class concatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] result;
        result = getConcatenation(nums);

        System.out.println(Arrays.toString(result));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] newArr = new int[nums.length*2];
        int j;
        for (int i = 0; i < nums.length*2; i++) {
            if (i> nums.length-1) j = i - nums.length;
            else j = i;
            newArr[i] = nums[j];
        }
        return newArr;
    }
}

import java.util.*;

public class singleNumber {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) list.remove(list.indexOf(nums[i]));
            else list.add(nums[i]);
        }
        return list.get(0);
    }
}

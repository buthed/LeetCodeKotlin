import java.util.*;

public class summaryRanges {
    public static void main(String[] args) {
        int[] nums1 = {0,1,2,4,5,7};
        int[] nums2 = {0,2,3,4,6,8,9};
        int[] nums3 = {};
        int[] nums4 = {-1};
        System.out.println("1 - "+summaryRanges(nums1)); // Output: ["0->2","4->5","7"]
        System.out.println("2 - "+summaryRanges(nums2)); // Output: ["0","2->4","6","8->9"]
        System.out.println("3 - "+summaryRanges(nums3));
        System.out.println("4 - "+summaryRanges(nums4));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length==0) return result;
        int start = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (count==0) start=nums[i];
            if (nums[i]+1 == nums[i+1]) {
                count++;
            }
            else if(start==i) {
                result.add(String.valueOf(nums[start]));

            } else {
                result.add(String.valueOf(nums[start])+"->"+String.valueOf(nums[start+count]));
                count=0;
            }
        }
        if (nums[nums.length-2]+1==nums[nums.length-1]) result.add(String.valueOf(nums[nums.length-2]+"->"+String.valueOf(nums[nums.length-1])));
        else result.add(String.valueOf(nums[nums.length-1]));
        return result;
    }
}

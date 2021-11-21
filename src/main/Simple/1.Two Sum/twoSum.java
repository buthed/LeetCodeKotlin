public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result;
        result = twoSum(nums,target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1+i; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] { nums[0], nums[1] };
    }
}

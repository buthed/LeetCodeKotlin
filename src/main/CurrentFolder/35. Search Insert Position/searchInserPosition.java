public class searchInserPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int hight = nums.length-1;
        int about = 0;

        while (low<=hight) {
            int mid = (low+hight)/2;
            if (nums[mid]== target) return mid;
            else if (nums[mid]<target) {
                low = mid+1;
            }
            else if (nums[mid]>target) {
                hight = mid-1;
            }
            about = mid;
        }
        if (target>nums[about]) return about+1;
        else if(nums[about]==0) return 0;
        else return about;

    }
}

public class JumpInArrayofNums {

    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) { // If the current index is greater than the maximum reachable index
                return false;
            }
            if (i + nums[i] > maxReach) {
                maxReach = i + nums[i];
            }
        }

        return maxReach >= nums.length - 1;
    }
    public static void main(String[] args) {
        JumpInArrayofNums jump = new JumpInArrayofNums();

        // Example 1
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println(jump.canJump(nums1));

        // Example 2
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println(jump.canJump(nums2));
    }
}

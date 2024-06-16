public class JumpInArrayofNums {

    public boolean canJump(int[] nums) {
        int maxReach = 0; // Initialize the maximum reach to 0
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) { // If the current index is greater than the maximum reachable index
                return false;
            }
            if (i + nums[i] > maxReach) {
                maxReach = i + nums[i];
            }
        }
        // Check if we can reach the last index
        return maxReach >= nums.length - 1;
    }

}

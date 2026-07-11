public class TwoSumIndices {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSumIndices solver = new TwoSumIndices();
        int[] nums = {2, 7, 11, 15};
        int target = 26;
        int[] result = solver.twoSum(nums, target);
        System.out.println("Result: [" + result[0] + ", " + result[1] + "]");
    }
}

class NumArray {
    // We store the prefix sums in this array
    private int[] prefixSums;

    public NumArray(int[] nums) {
        int n = nums.length;
        // Create an array one size larger to handle the 'left - 1' case easily
        prefixSums = new int[n + 1];
        
        // Fill the prefixSums array
        // prefixSums[i] will store the sum of nums[0...i-1]
        for (int i = 0; i < n; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        // Because of our index shift (prefixSums[i+1] = sum up to i),
        // the sum from left to right is: prefixSums[right + 1] - prefixSums[left]
        return prefixSums[right + 1] - prefixSums[left];
    }
}
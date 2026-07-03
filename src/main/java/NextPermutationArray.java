public class NextPermutationArray {
    public void nextPermutation(int[] nums) {
        // 1. Find the first breakpoint from the right
        int pivotIndex = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivotIndex = i;
                break;
            }
        }

        // 2. If a pivot is found, perform the swap
        if (pivotIndex != -1) {
            // Find the first number from the right that is larger than the pivot
            for (int i = nums.length - 1; i > pivotIndex; i--) {
                if (nums[i] > nums[pivotIndex]) {
                    swap(nums, i, pivotIndex);
                    break;
                }
            }
        }

        // 3. Reverse the suffix (everything after pivotIndex)
        // If no pivot was found, this effectively reverses the whole array
        reverse(nums, pivotIndex + 1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

}

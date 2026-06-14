public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            // Find the middle index
            int mid = left + (right - left) / 2;
            
            // Scenario 1: We found the target! Return its index.
            if (nums[mid] == target) {
                return mid;
            } 
            // Scenario 2: Target is larger, search the right half
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            // Scenario 3: Target is smaller, search the left half
            else {
                right = mid - 1;
            }
        }
        
        // Scenario 4: If the target wasn't found, 'left' will naturally 
        // point to the exact index where it should be inserted!
        return left;
    }

    public static void main(String[] args) {
        SearchInsertPosition solution = new SearchInsertPosition();
        
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println(solution.searchInsert(nums1, target1)); // Output: 2
        
        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println(solution.searchInsert(nums2, target2)); // Output: 1
        
        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println(solution.searchInsert(nums3, target3)); // Output: 4
        
        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;
        System.out.println(solution.searchInsert(nums4, target4)); // Output: 0
    }
}
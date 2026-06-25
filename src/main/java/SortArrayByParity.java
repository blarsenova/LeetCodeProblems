public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            // If left pointer is on an odd number and right is on an even, swap them
            if (nums[left] % 2 > nums[right] % 2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            
            // Move pointers
            if (nums[left] % 2 == 0) left++;
            if (nums[right] % 2 != 0) right--;
        }
        
        return nums;
    } 

    public static void main(String[] args) {
        SortArrayByParity solution = new SortArrayByParity();
        
        int[] nums = {3, 1, 2, 4};
        int[] sortedArray = solution.sortArrayByParity(nums);
        
        // Option 1: Clean single-line print using Arrays utility
        System.out.println("Sorted Array by Parity: " + java.util.Arrays.toString(sortedArray));
        
        // Option 2: Using the loop
        System.out.print("Sorted Array by Parity: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
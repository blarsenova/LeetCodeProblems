import java.util.Arrays;

public class RotateArray {
 
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1 || k <= 0) return;
        
        // Handle cases where k is greater than the array length
        k = k % nums.length; 

        for (int i = 0; i < k; i++) {
            // 1. Save the last element
            int temp = nums[nums.length - 1];
            
            // 2. Shift all elements to the right by 1
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            
            // 3. Move the saved element to the front
            nums[0] = temp;
        }
    }

    public static void main(String[] args) {
        RotateArray solution = new RotateArray();
        
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        
        solution.rotate(nums1, k1);
        
        // Option 1: Clean single-line print using Arrays utility
        System.out.println("Rotated Array: " + Arrays.toString(nums1));
        
        // Option 2: Using the loop
        System.out.print("Rotated Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
} 

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        int n = nums.length;
        
        // Use a while loop to control pointer movement independently
        while (even < n && odd < n) {
            // If even index has an even number, it's correct; skip it
            if (nums[even] % 2 == 0) {
                even += 2;
            } 
            // If odd index has an odd number, it's correct; skip it
            else if (nums[odd] % 2 != 0) {
                odd += 2;
            } 
            // If neither, both are in the wrong place; swap them
            else {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                
                // After swapping, these positions are now correct
                even += 2;
                odd += 2;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        SortArrayByParityII solution = new SortArrayByParityII();
        
        int[] nums = {4, 2, 5, 7};
        int[] sortedArray = solution.sortArrayByParityII(nums);
        
        // Option 1: Clean single-line print using Arrays utility
        System.out.println("Sorted Array by Parity II: " + java.util.Arrays.toString(sortedArray));
        
        // Option 2: Using the loop
        System.out.print("Sorted Array by Parity II: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();   
    }

}

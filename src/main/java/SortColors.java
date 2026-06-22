public class SortColors {
    public void sortColors (int nums []) {

int reds=0;
int whites=0;
int blues=0;


 for (int i=0; i<nums.length;i++){
     if (nums[i]==0){
         reds++;
     }
     else if (nums[i]==1){
         whites++;
     }
     else if (nums[i]==2){
         blues++;
     } }
     // Pass 2: Overwrite the original array
        int index = 0;
        
        while (reds > 0) {
            nums[index++] = 0;
            reds--;
        }
        while (whites > 0) {
            nums[index++] = 1;
            whites--;
        }
        while (blues > 0) {
            nums[index++] = 2;
            blues--;
        }

}

    public static void main(String[] args) {
        SortColors solution = new SortColors();
        
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums1);
        
        // Option 1: Clean single-line print using Arrays utility
        System.out.println("Sorted Colors: " + java.util.Arrays.toString(nums1));
        
        // Option 2: Using the loop
        System.out.print("Sorted Colors: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

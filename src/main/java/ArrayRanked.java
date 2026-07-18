import java.util.*;

public class ArrayRanked {
    public int[] arrayRankTransform(int[] arr) {
        // 1. Create a sorted copy of unique elements
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        
        // 2. Map each number to its rank
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedArr) {
            // Only add to map if the number hasn't been ranked yet
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }
        
        // 3. Create the result array using the map
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        ArrayRanked solution = new ArrayRanked();
        int[] input = {40, 10, 20, 40};
        int[] output = solution.arrayRankTransform(input);
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Ranked output: " + Arrays.toString(output));
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapFrequencyCount {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Build the frequency map
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        // 2. Put keys into a list to sort them
        List<Integer> uniqueElements = new ArrayList<>(countMap.keySet());

        // 3. Sort by frequency (descending)
        // We use a custom comparator to look up values in the map
        Collections.sort(uniqueElements, (a, b) -> countMap.get(b) - countMap.get(a));

        // 4. Extract the top k
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = uniqueElements.get(i);
        }
        
        return result;
    }
}
    


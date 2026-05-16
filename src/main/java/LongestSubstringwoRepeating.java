import java.util.HashMap;

public class LongestSubstringwoRepeating {


    public static void main(String[] args) {
        LongestSubstringwoRepeating lab = new LongestSubstringwoRepeating();

        String testInput = "abcabcbbuu";
        int result = lab.lengthOfLongestSubstring(testInput);

        System.out.println("The longest substring length for '" + testInput + "' is: " + result);
    }

    // 2. This method must be OUTSIDE of main, but INSIDE the class
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (charMap.containsKey(currentChar)) {
                left = Math.max(charMap.get(currentChar) + 1, left);
            }

            charMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
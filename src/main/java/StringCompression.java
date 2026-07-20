public class StringCompression {

        public static void main(String[] args) {
            StringCompression solution = new StringCompression();

            // Test case 1
            char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
            int newLength1 = solution.compress(chars1);
            System.out.print("Output length: " + newLength1 + ", Array: ");
            printChars(chars1, newLength1);

            // Test case 2
            char[] chars2 = {'a'};
            int newLength2 = solution.compress(chars2);
            System.out.print("Output length: " + newLength2 + ", Array: ");
            printChars(chars2, newLength2);

            // Test case 3
            char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
            int newLength3 = solution.compress(chars3);
            System.out.print("Output length: " + newLength3 + ", Array: ");
            printChars(chars3, newLength3);
        }

        private static void printChars(char[] chars, int length) {
            System.out.print("[");
            for (int i = 0; i < length; i++) {
                System.out.print("\"" + chars[i] + "\"");
                if (i < length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }


        public int compress(char[] chars) {
            int writeIndex = 0; // Where we write the compressed characters in the array
            int readIndex = 0;  // Where we read the consecutive groups from the array

            while (readIndex < chars.length) {
                char currentChar = chars[readIndex];
                int groupLength = 0;

                // Count the number of consecutive repeating characters
                while (readIndex < chars.length && chars[readIndex] == currentChar) {
                    readIndex++;
                    groupLength++;
                }

                // Write the character
                chars[writeIndex++] = currentChar;

                // If the group length is greater than 1, convert it to characters and write each digit
                if (groupLength > 1) {
                    for (char c : Integer.toString(groupLength).toCharArray()) {
                        chars[writeIndex++] = c;
                    }
                }
            }

            return writeIndex;
        }

}

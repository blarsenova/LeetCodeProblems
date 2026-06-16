public class binaryString {
    
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int
                j--;
            }

            result.append(sum % 2); // Append the current bit
            carry = sum / 2; // Update the carry
        }

        return result.reverse().toString(); // Reverse the result and convert to string
    }

    public static void main(String[] args) {
        binaryString solution = new binaryString();

        String a1 = "11";
        String b1 = "1";
        System.out.println(solution.addBinary(a1, b1)); // Output: "100"

        String a2 = "1010";
        String b2 = "1011";
        System.out.println(solution.addBinary(a2, b2)); // Output: "10101"
    }
}

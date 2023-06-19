package binary;

public class AddBinaryString {

    // Runtime: O(N + M) where N is the length of one string and M is the length of the other string
    // Space complexity: O(max(N, M)) as the longest our resulting string will be is the length of the longer string + 1
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            result.append(1);
        }

        return result.reverse().toString();
    }
}

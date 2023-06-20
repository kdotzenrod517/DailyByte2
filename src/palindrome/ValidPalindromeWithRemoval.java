package palindrome;

public class ValidPalindromeWithRemoval {

    public static void main(String[] args) {
        System.out.println(validPalindrome("abcba")); // true
        System.out.println(validPalindrome("foobof")); // true (remove the first 'o', the second 'o', or 'b')
        System.out.println(validPalindrome("abccab")); // false
    }

    // Runtime: O(N) where N is the number of characters in our string
    // Space complexity: O(1) or constant
    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isValid(s, i + 1, j) || isValid(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isValid(String s, int i, int j) {

        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}

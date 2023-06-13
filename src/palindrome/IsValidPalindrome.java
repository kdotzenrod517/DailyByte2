package palindrome;

public class IsValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isValid("level")); // true
        System.out.println(isValid("algorithm")); // false
        System.out.println(isValid("A man, a plan, a canal: Panama.")); // true
    }

    // Runtime: O(N) where N is the number of characters in the given string because we only traverse the string once (even though there are nested loops - don’t be fooled!).
    // Space complexity: O(1) or constant as we only need couple variables to solve the problem (regardless of the size of the string)
    public static boolean isValid(String s){

        s = s.replaceAll("[^a-zA-Z]+", "").trim().toLowerCase();

        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if(Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) {
                return false;
            }
        }

        return true;
    }
}

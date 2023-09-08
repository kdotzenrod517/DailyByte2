package string;

public class Subsequence {

    // Solution: https://thedailybyte.dev/solution/93?token=611fb1db9483aed5a3e275444ca76bfee2e0a330ebdb7db689244eade13e993e
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "aabbcc")); // true
        System.out.println(isSubsequence("cpu", "computer")); // true
        System.out.println(isSubsequence("xyz", "axbyc")); // false
    }

    // Runtime: O(N) where N is the length of t. This is because in the worst case, we’ll have to iterate through all characters in t only to determine that s is not a subsequence of t.
    // Space complexity: O(1) or constant as we only need our index variable to solve our problem regardless of the size of s and t.
    public static boolean isSubsequence(String s, String t){

        int index = 0;

        for(int i = 0; i < t.length(); i++){

            if(s.charAt(index) == t.charAt(i)){
                index++;
            }

            if(index == s.length()){
                return  true;
            }
        }

        return false;
    }
}

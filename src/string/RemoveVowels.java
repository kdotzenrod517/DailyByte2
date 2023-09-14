package string;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {

    // Solution: https://thedailybyte.dev/solution/94?token=8963575bff029ee50a05b17a37c0be042812209da835bc430ed326e827c65acf
    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(N) where N is the total number of character in s. This results from building our new string builder to eventually return.
    public String removeVowels(String s) {
        String vowels = "aeiouAEIOU";
        Set<Character> toRemove = new HashSet<>();
        for (int i = 0; i < vowels.length(); i++) {
            toRemove.add(vowels.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (!toRemove.contains(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}

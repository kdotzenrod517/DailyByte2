package string;

import java.util.HashMap;

public class CharacterScrambler {

    // Solution: https://thedailybyte.dev/solution/89?token=a54f764d05b1618174d24a8a6ee50d6b448489707d9a3d352623bee387a5785c
    // Runtime: O(N + M) where N is the number of characters in passage and M is the number of characters in text. This results from us iterating through both of them entirely.
    // Space complexity: O(1) or constant since we know our hash map can only grow to a maximum size of 26 (restricted by the constraint that we will only encounter lowercase alphabetical characters).
    public boolean characterScramble(String passage, String text) {
        HashMap<Character, Integer> counts = new HashMap<>();
        for(char c: text.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for(char c: passage.toCharArray()) {
            if(!counts.containsKey(c) || counts.get(c) <= 0) {
                return false;
            }

            counts.put(c, counts.get(c) - 1);
        }

        return true;
    }
}

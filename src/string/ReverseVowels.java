package string;

import java.util.HashSet;

public class ReverseVowels {

    // Solution: https://thedailybyte.dev/solution/92?token=13e640e7d64ea50a4bf747655f4dfbbe219cd0133496b1367bcdf9a7e2944380
    // Runtime: O(N) where N is the total number of character in s.
    // Space complexity: O(N) where N is the total number of characters in s. This results from creating an additional character array from our string s. This is necessary since strings in Java are immutable.
    public String reverseVowels(String s) {
        String vowelCharacters = "aeiouAEIOU";
        HashSet<Character> vowels = new HashSet<Character>();
        for (char c: vowelCharacters.toCharArray()) {
            vowels.add(c);
        }

        char[] characters = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            while(i < j && !vowels.contains(s.charAt(i))) {
                i++;
            }

            while(j > i && !vowels.contains(s.charAt(j))) {
                j--;
            }

            char temp = characters[i];
            characters[i++] = characters[j];
            characters[j--] = temp;
        }

        return new String(characters);
    }
}

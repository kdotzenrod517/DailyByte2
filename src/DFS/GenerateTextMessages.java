package DFS;

import java.util.ArrayList;
import java.util.List;

public class GenerateTextMessages {

    // Runtime: O(NM) where N is the maximum number of characters any digit is allowed to map to and M is the number of digits we’re given in our string (this is because we have N choices, i.e. each letter in a mapping, for every digit in our string, i.e. M digits).
    // Space complexity: O(M) where M is the number of digits we’re given in our string (due to our recursive calls on the stack).
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return result;
        }

        String[] mappings = {
                "0",
                "1",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };

        generateCombinations(0, "", mappings, digits, result);
        return result;
    }

    public void generateCombinations(int index, String current, String[] mappings, String digits, List<String> result) {
        if(index >= digits.length()) {
            result.add(current);
            return;
        }

        String letters = mappings[digits.charAt(index) - '0'];
        for(char c: letters.toCharArray()) {
            generateCombinations(index + 1, current + c, mappings, digits, result);
        }
    }
}

package backtracking;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    public static void main(String[] args) {
        System.out.println(permutations("c7w2")); // return ["c7w2", "c7W2", "C7w2", "C7W2"]
    }

    // Runtime: O(2N) where N is the total number of characters in S. This results from us having 2 choices at every character in the worst case (i.e. uppercase the current letter and lowercase the current letter)
    // Space complexity: O(2N) where N is the total number of characters in S. This results from us storing all 2N permutations of S.
    public static List<String> permutations(String s){
        List<String> permutations = new ArrayList<>();
        generatePermutations(s, 0, permutations, "");
        return permutations;
    }

    public static void generatePermutations(String s, int index, List<String> permutations, String current){
        if(index >= s.length()){
            permutations.add(current);
            return;
        }

        char c = s.charAt(index);
        if(Character.isLetter(c)) {
            generatePermutations(s, index + 1, permutations, current + Character.toUpperCase(c));
            generatePermutations(s, index + 1, permutations, current + Character.toLowerCase(c));
        } else {
            generatePermutations(s, index + 1, permutations, current + c);
        }
    }
}

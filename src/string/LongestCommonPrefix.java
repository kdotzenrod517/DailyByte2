package string;

import java.util.List;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestPrefix(List.of("colorado", "color", "cold"))); // col
        System.out.println(longestPrefix(List.of("a", "b", "c"))); //
        System.out.println(longestPrefix(List.of("spot", "spotty", "spotted"))); // spot
    }

    // Runtime: O(N*M) where N is the number of words we’re given and M is the max number of characters a single string can contain. This runtime is derived from the fact that the worst case we will traverse every word and every character in every word.
    // Space complexity: O(M) where M is the max number of characters a string can contain. This is because the longest our prefix can become is M characters long.
    public static String longestPrefix(List<String> strings){
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for(char c : strings.get(0).toCharArray()){
            for(int i = 1; i < strings.size(); i++){
                if(index >= strings.get(i).length() || c != strings.get(i).charAt(index)){
                    return sb.toString();
                }
            }
            sb.append(c);
            index++;
        }
        return sb.toString();
    }
}

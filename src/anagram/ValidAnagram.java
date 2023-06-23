package anagram;

import java.util.HashMap;
import java.util.HashSet;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("cat", "tac")); // true
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("program", "function")); // false
    }

    // Runtime: O(N) where N is the total number of characters in both s and t. This is because we will need to iterate through every character in each string to confirm whether or not s is an anagram of t in the worst case.
    // Space complexity: O(N) as we will create a hash map that will store all the characters in one of our strings
    public static boolean isAnagram(String s, String t){

        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(Character c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Character c : s.toCharArray()){
            if(!map.containsKey(c) || map.get(c) <= 0){
                return false;
            }

            map.put(c, map.get(c, 0) - 1);
        }

        return true;
    }
}

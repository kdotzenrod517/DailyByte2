package string;

import java.util.HashMap;

public class SpotTheDifference {

    public static void main(String[] args) {
        System.out.println(findTheDiff("foobar", "barfoot")); // t
        System.out.println(findTheDiff("ide", "idea")); // a
        System.out.println(findTheDiff("coding", "ingcod")); //
    }

    // Runtime: O(N) where N is the total number of characters between s and t.
    // Space complexity: O(N) where N is the total number of characters in s.
    public static Character findTheDiff(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();

        for(Character c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Character c : t.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0){
                return c;
            }
            map.put(c, map.get(c) - 1);
        }

        return ' ';
    }
}

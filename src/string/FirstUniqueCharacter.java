package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(firstUnique("abcabd")); // 2
        System.out.println(firstUnique("thedailybyte")); // 1
        System.out.println(firstUnique("developer")); // 0
    }

    // Runtime: O(N) where N is the number of characters in s.
    // Space complexity: O(N) where N is the number of characters in s.
    public static int firstUnique(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }
}

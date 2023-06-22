import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class JewelsAndStones {

    public static void main(String[] args) {
        System.out.println(jewelsAndStones("abc", "ac")); // 2
        System.out.println(jewelsAndStones("Af", "AaaddfFf")); // 3
        System.out.println(jewelsAndStones("AYOPD", "ayopd")); // 0
    }

    // Runtime: O(N + M) since we will need to iterate through all of our jewels to throw them into a hash set (let’s call it N jewels) and all of our stones to validate whether or not each one is a jewel (let’s call it M stones).
    // Space complexity: O(N) as we will throw each of our jewels into our hash set.
    public static int jewelsAndStones(String jewels, String stones){
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(Character c : stones.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Character c : jewels.toCharArray()){
            if(map.containsKey(c)){
                count += map.get(c);
            }
        }

        return count;
    }

    public int numJewelsFromStones(String stones, String jewels) {
        HashSet<Character> jewelsSet = new HashSet<Character>();
        for(char c: jewels.toCharArray()) {
            jewelsSet.add(c);
        }

        int numJewels = 0;
        for(char c: stones.toCharArray()) {
            if(jewelsSet.contains(c)) {
                numJewels++;
            }
        }

        return numJewels;
    }
}

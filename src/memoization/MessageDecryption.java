package memoization;

import java.util.HashMap;
import java.util.Map;

public class MessageDecryption {

    // Solution: https://thedailybyte.dev/solution/72?token=896df3c12ac1c38575f342ad1514fdc0f5430ef6dbcf6ff37811858df0832d05
    // Runtime: O(N) where N is the total number of characters in our message.
    // Space complexity: O(N) where N is the total number of characters in our array. This results from storing at most N elements in our memoize hash map.
    public int numDecodings(String message) {
        if (message == null || message.length() == 0) {
            return 0;
        }

        return decryptMessage(0, message, new HashMap<Integer, Integer>());
    }

    public int decryptMessage(int index, String message, Map<Integer, Integer> memoize) {
        if (index >= message.length()) {
            return 1;
        }
        if (message.charAt(index) == '0') {
            return 0;
        }
        if (index == message.length() - 1) {
            return 1;
        }
        if (memoize.containsKey(index)) {
            return memoize.get(index);
        }

        int waysToDecrypt = decryptMessage(index + 1, message, memoize);
        if (Integer.parseInt(message.substring(index, index + 2)) <= 26) {
            waysToDecrypt += decryptMessage(index + 2, message, memoize);
        }

        memoize.put(index, waysToDecrypt);
        return waysToDecrypt;
    }
}

package string;

public class DefangIPs {

    // Solution: https://thedailybyte.dev/solution/91?token=4b64e2becabdf7e7a13efa324e58ef7e26f0d1fca22b7fa6d1188d7280d0ff1d
    // Runtime: O(N) where N is the total number of characters in our IP address (one could also say that this is a constant runtime assuming that there is some standard maximum length to an IP address).
    // Space complexity: O(N) where N is the total number of characters in our IP address. This results from creating a string builder with N characters. (one could also say that this is a constant runtime assuming that there is some standard maximum length to an IP address).
    public String defangIP(String address) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char current = address.charAt(i);
            if (current == '.') {
                result.append("[.]");
            } else {
                result.append(current);
            }
        }

        return result.toString();
    }
}

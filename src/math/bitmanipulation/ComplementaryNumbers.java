package math.bitmanipulation;

public class ComplementaryNumbers {

    // Solution: https://thedailybyte.dev/solution/82?token=b7b3cd0d079a4aa6188d1dec0c92871f3d49120f9c9e8358dabbb1a455497b55
    // Runtime: O(logN) where N is the origin number we’re given.
    // Space complexity: O(1) or constant.
    public int complementaryNumber(int number) {
        int result = 0;
        int power = 1;
        while(number > 0) {
            result += power * ((number % 2) ^ 1);
            power = power <<= 1;
            number >>= 1;
        }

        return result;
    }
}

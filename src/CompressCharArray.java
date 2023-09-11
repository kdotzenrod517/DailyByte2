public class CompressCharArray {

    // Solution: https://thedailybyte.dev/solution/90?token=7bd4a69e67a65b345a028c7534f2cc5464a02f6c92b6e8eafd6bc59fb8fd896c
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'a', 'a', 'a', 'a'})); // 2, ['a', '6']
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c'})); // 6, ['a', '2', 'b', '2', 'c', '2']
    }

    // Runtime: O(N) where N is the total number of character in chars.
    // Space complexity: O(1) or constant since we compress our array in-place.
    public static int compress(char[] chars){

        int index = 0;
        int i = 0;

        while(i < chars.length){
            int j = i;
            while(j < chars.length && chars[j] == chars[i]){
                j++;
            }

            chars[index++] = chars[i];
            if(j - i > 1){
                String count = j - i + "";
                for(char c : count.toCharArray()){
                    chars[index++] = c;
                }
            }

            i = j;
        }

        return index;
    }
}

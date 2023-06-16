package string;

public class CorrectCapitalization {

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA")); // true
        System.out.println(detectCapitalUse("Calvin")); // true
        System.out.println(detectCapitalUse("compUter")); // false
        System.out.println(detectCapitalUse("coding")); // true
    }

    // Runtime: O(N) where N is the number of characters in our word
    // Space complexity: O(1) or constant
    public static boolean detectCapitalUse(String word){
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }

        return count == word.length() || (count == 1 && Character.isUpperCase(word.charAt(0))) || count == 0;
    }
}

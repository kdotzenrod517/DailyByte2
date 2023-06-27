package string;

import java.util.*;

public class UncommonWords {

    public static void main(String[] args) {
        System.out.println(uncommonWords("the quick", "brown fox")); // ["the", "quick", "brown", "fox"]
        System.out.println(uncommonWords("the tortoise beat the haire", "the tortoise lost to the haire")); // ["beat", "to", "lost"]
        System.out.println(uncommonWords("copper coffee pot", "hot coffee pot")); // ["copper", "hot"]
    }


    // Runtime: O(N) where N is the total number of words in our two sentences.
    // Space complexity: O(N) where N is the total number of words in our two sentences.
    public static Set<String> uncommonWords(String sentence1, String sentence2){
        HashSet<String> set = new HashSet<>(Arrays.asList(sentence1.split(" ")));

        for(String s : sentence2.split(" ")){
            if(!set.contains(s)){
                set.add(s);
            } else {
                set.remove(s);
            }
        }

        return set;
    }
}

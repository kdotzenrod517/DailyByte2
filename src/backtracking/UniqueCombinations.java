package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueCombinations {

    // Runtime: O(2N) where N is our total number of numbers. This results from having two choices at each of our N numbers.
    // Space complexity: O(N) where N is the total number of elements in numbers. This results from having at most N calls on our stack from our recursive calls.
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 4, 6, 3}, 6));
    }

    public static List<List<Integer>> combinationSum(int[] numbers, int target) {
        List<List<Integer>> combos = new ArrayList<>();
        Arrays.sort(numbers);
        generateCombinations(combos, new ArrayList<>(), numbers, target, 0);

        return combos;
    }

    public static void generateCombinations(List<List<Integer>> combinations, List<Integer> current, int[] numbers, int remaining, int start) {

        if(remaining < 0){
            return;
        }

        if(remaining == 0){
            combinations.add(new ArrayList<>(current));
            return;
        }

        for(int i = start; i < numbers.length; i++){
            current.add(numbers[i]);
            generateCombinations(combinations, current, numbers, remaining - numbers[i], i);
            current.remove(current.size() - 1);
        }
    }

}
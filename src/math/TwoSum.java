package math;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{1, 3, 8, 2}, 10)); // true (8 + 2)
        System.out.println(twoSum(new int[]{3, 9, 13, 7}, 8)); // false
        System.out.println(twoSum(new int[]{4, 2, 6, 5, 2}, 4)); // true (2 + 2)
    }

    // Runtime: O(N) where N is the number of integers in our list
    // Space complexity: O(N) because we use a hash map to store all N numbers in the worst case
    public static boolean twoSum(int[] nums, int k){

        Set<Integer> seen = new HashSet<>();

        for(int num : nums){
            int diff = k - num;
            if(seen.contains(diff)){
                return true;
            }
            seen.add(num);
        }

        return false;
    }
}

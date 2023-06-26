package intersection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfNumbers {

    public static void main(String[] args) {
        System.out.println(intersection(new int[]{2, 4, 4, 2}, new int[]{2, 4})); // 2, 4
        System.out.println(intersection(new int[]{1, 2, 3, 3}, new int[]{3, 3})); // 3
        System.out.println(intersection(new int[]{2, 4, 6, 8}, new int[]{1, 3, 5, 7})); //
    }

    // Runtime: O(N) where N is the total number of elements in nums1 and nums2.
    // Space complexity: O(M) where M is the total number of elements in nums1.
    public static List<Integer> intersection(int[] nums1, int[] nums2){

        HashSet<Integer> set = new HashSet<>();
        List<Integer> response = new ArrayList<>();

        for(int num : nums1){
            set.add(num);
        }

        for(int num : nums2){
            if(set.contains(num)){
                response.add(num);
                set.remove(num);
            }
        }


        return response;
    }
}

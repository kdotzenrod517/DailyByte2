package binarysearch;

public class BuggySoftware {

    // Solution: https://thedailybyte.dev/solution/87?token=4dd9dd1c0cdf206bdc04acaf8afbd2658590573d0ccf4a3ce1bbc73a8f9f86a1
    // Runtime: O(logN). This results from discarding half of our search space each time we call isBadRelease().
    // Space complexity: O(1) or constant since our memory usage does not scale as N does.
    public static int badReleases(int N) {
        int left = 0;
        int right = N;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(isBadRelease(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    // stubbed
    public static boolean isBadRelease(int n){
        return false;
    }
}



package queues;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCallCounter {

    Queue<Integer> queue;

    public RecentCallCounter(){
        queue = new LinkedList<>();
    }

    // Runtime: O(N) where N is the number of queries made to ping.
    //S pace complexity: generally speaking O(W) where W is our window size
    // but this can be considered O(1) in our case since our window size
    // is fixed at 3 seconds.
    public int ping(int t){
        queue.add(t);
        while(queue.peek() < t - 3000){
            queue.remove();
        }
        return queue.size();
    }
}

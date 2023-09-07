import java.util.*;

public class KillDescendants {

    // Solution: https://thedailybyte.dev/solution/47?token=cf74f3aee3b59e6d04aa6114b0b6d515eba19d2488f6b9a68e5d116eb1907e41
    // Runtime: O(N) where N is the number of processes we’re given.
    // Space complexity: O(N) where N is the number of processes we’re given.
    public List<Integer> killDescendants(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer, List<Integer>> parentToChildren = new HashMap<>();
        for (int i = 0; i < ppid.size(); i++) {
            parentToChildren.putIfAbsent(ppid.get(i), new ArrayList<>());
            parentToChildren.get(ppid.get(i)).add(pid.get(i));
        }

        List<Integer> killed = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(kill);
        while (!queue.isEmpty()) {
            int current = queue.remove();
            killed.add(current);
            if (parentToChildren.containsKey(current)) {
                queue.addAll(parentToChildren.get(current));
            }
        }

        return killed;
    }
}

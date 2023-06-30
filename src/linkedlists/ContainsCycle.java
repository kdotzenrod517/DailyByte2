package linkedlists;

public class ContainsCycle {

    public static void main(String[] args) {
        ListNode one = new ListNode(3);
        ListNode two = new ListNode(5);
        ListNode three = new ListNode(9);
        one.next = two;
        two.next = three;
        three.next = one;

        ListNode one2 = new ListNode(1);
        one2.next = one2;
        System.out.println(containsCycle(one)); // true
        System.out.println(containsCycle(new ListNode(1, new ListNode(2, new ListNode(3, null))))); // false
        System.out.println(containsCycle(one2)); // true
    }

    // Runtime: O(N) where N is the number of nodes in our list.
    // Space complexity: O(1) or constant.
    public static boolean containsCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}

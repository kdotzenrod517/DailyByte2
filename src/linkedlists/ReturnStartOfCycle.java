package linkedlists;

public class ReturnStartOfCycle {

//    public static void main(String[] args) {
//        ListNode one = new ListNode(1);
//        ListNode two = new ListNode(2);
//        ListNode three = new ListNode(3);
//
//        one.next = two;
//        two.next = three;
//        three.next = one;
//
//        ListNode one2 = new ListNode(1);
//        ListNode two2 = new ListNode(2);
//        ListNode three2 = new ListNode(3);
//        ListNode four2 = new ListNode(4);
//        ListNode five2 = new ListNode(5);
//
//        one2.next = two2;
//        two2.next = three2;
//        three2.next = four2;
//        four2.next =  five2;
//        five2.next = two2;
//
//        System.out.println(returnStartOfCycle(one)); // null
//        System.out.println(returnStartOfCycle(one2)); // (5 points back to 2), return a reference to the node containing 2
//        System.out.println(returnStartOfCycle(one2)); // (7 points to itself), return a reference to the node containing 7
//    }

    // Runtime: O(N) where N is the number of nodes in our list.
    // Space complexity: O(1) or constant.
    public static ListNode returnStartOfCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}

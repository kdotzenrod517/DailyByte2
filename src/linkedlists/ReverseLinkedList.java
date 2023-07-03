package linkedlists;

public class ReverseLinkedList {

    public static void main(String[] args) {
        // return a reference to the node that contains 3 which points to a list that looks like the following: 3->2->1->null
        System.out.println(reverse(new ListNode(1, new ListNode(2, new ListNode(3, null)))));
        // return a reference to the node that contains 2 which points to a list that looks like the following: 2->9->15->7->null
        System.out.println(reverse(new ListNode(7, new ListNode(15, new ListNode(9, new ListNode(2, null))))));
        // return a reference to the node that contains 1 which points to a list that looks like the following: 1->null
        System.out.println(reverse(new ListNode(1, null)));
    }

    // Runtime: O(N) where N is the number of nodes in our list.
    // Space complexity: O(1) or constant.
    private static ListNode reverse(ListNode head) {

        ListNode prev = null;

        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}

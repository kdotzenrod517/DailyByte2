package linkedlists;

public class RemoveNthToLastNode {

    // To remove a node from a linked list, we must set the previous node’s next value in such a way that it skips over the node to be removed.
    // This fact tells us that we must find a way to have a reference to
    // this node to be able to solve the problem at hand.
    // This can be accomplished by walking a fast pointer n steps ahead of a
    // slow pointer. Once the faster pointer is n steps ahead,
    // we can walk both the fast and slow pointer through the list until
    // fast is null. When fast is null, slow will be pointing at the node
    // before the node we are removing. Now all that’s required is to set
    // slow.next = slow.next.next to remove the nth to last node and return
    // dummy.next (i.e. the start of our return list).
    public static void main(String[] args) {
        //  1->2->null
        System.out.println(removeNode(new ListNode(1, new ListNode(2, new ListNode(3, null))), 1).toString());
        //  1->3->null
        System.out.println(removeNode(new ListNode(1, new ListNode(2, new ListNode(3, null))), 2).toString());
        // 2->3->null
        System.out.println(removeNode(new ListNode(1, new ListNode(2, new ListNode(3, null))), 3).toString());
    }

    // Runtime: O(N) where N is the number of nodes in our list.
    // Space complexity: O(1) or constant.
    public static ListNode removeNode(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        while(n > 0) {
            fast = fast.next;
            n--;
        }

        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}



package linkedlists;

import java.util.List;

public class MergeSortedLinkedLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, null)));
        ListNode list2 = new ListNode(4, new ListNode(5, new ListNode(6, null)));
        // 1->2->3->4->5->6->null
        System.out.println(mergeLists(list1, list2).toString()); //  1->2->3->4->5->6->null
        // 1->2->3->4->5->6->null
        System.out.println(mergeLists(new ListNode(1, new ListNode(3, new ListNode(5, null))), new ListNode(2, new ListNode(4, new ListNode(6, null)))).toString());
        // 1->4->4->5->6->7->null
        System.out.println(mergeLists(new ListNode(4, new ListNode(4, new ListNode(7, null))), new ListNode(1, new ListNode(5, new ListNode(6, null)))).toString());
    }

    // Runtime: O(N) where N is the number of nodes in both of our lists.
    // Space complexity: O(1) or constant as we only create one new node dummy before merging our two lists together.
    public static ListNode mergeLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }

        if(l1 != null){
            dummy.next = l1;
        } else {
            dummy.next = l2;
        }

        return head.next;
    }
}

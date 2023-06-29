package linkedlists;

public class RemoveValue {

    public static void main(String[] args) {
        // 1->2->null
        System.out.println(removeValue(new ListNode(1, new ListNode(2, new ListNode(3, null))), 3).toString());
        // 8->4->12->null
        System.out.println(removeValue(new ListNode(8, new ListNode(1, new ListNode(1, new ListNode(4, new ListNode(12, null))))), 1).toString());
        // 12->2->9->null
        System.out.println(removeValue(new ListNode(7, new ListNode(12, new ListNode(2, new ListNode(9, null)))), 7).toString());
    }

    // Runtime: O(N) where N is the number of nodes in our list.
    // Space complexity: O(1) or constant
    public static ListNode removeValue(ListNode head, int n) {

       while(head != null && head.val == n){
           head = head.next;
       }

       ListNode dummy = head;

       while(dummy != null){
           if(dummy.next != null && dummy.next.val == n){
               dummy.next = dummy.next.next;
           } else {
               dummy = dummy.next;
           }
       }
       return head;
    }
}

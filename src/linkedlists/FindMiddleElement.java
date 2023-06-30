package linkedlists;

public class FindMiddleElement {

    public static void main(String[] args) {
        System.out.println(middleElement(new ListNode(1, new ListNode(2, new ListNode(3, null))))); // 2
        System.out.println(middleElement(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null)))))); // 3
        System.out.println(middleElement(new ListNode(1, null))); // 1
    }

    // Runtime: O(N) where N is the number of nodes in our list.
    // Space complexity: O(1) or constant.
    public static ListNode middleElement(ListNode head){
        int count = 0;
        ListNode dummy = head;

        while(dummy != null) {
            dummy = dummy.next;
            count++;
        }

        for(int i = 0; i < count / 2; i++){
            head = head.next;
        }

        return head;
    }
}

package linkedlists;

public class ListNode {

    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int item) {
        this(item, null);
    }

    public String toString() {
        String result = val + " ";
        if (next != null) {
            result += next.toString();
        }
        return result;
    }
}

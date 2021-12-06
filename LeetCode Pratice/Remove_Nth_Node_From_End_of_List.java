/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Remove_Nth_Node_From_End_of_List{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        // previous element of slow ptr (in linked list to delete current element, prev element pointer is required)
        ListNode prev = null;

        // move fast pointer n step ahead
        while(n-- > 0) {
            fast = fast.next;
        }

        // move both pointer until fast pointer becomes null
        while(fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        // if prev is null, it means first element to be deleted (n == size of linked list)
        if(prev == null) {
            // just return pointer to second element
            return head.next;
        }

        // delete element at slow pointer
        prev.next = slow.next;

        return head;
    }
}

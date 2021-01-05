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
class Solution {
    public ListNode deleteDuplicates (ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dummyhead = new ListNode (0);
        dummyhead.next = head;
        ListNode curr = head, next = head.next, prev = dummyhead;
        while (curr != null && next != null) {
            if (curr.val != next.val) {
                prev = curr;
                curr = curr.next;
                next = (next.next == null) ? null : next.next;
            }
            else {
                while (next.next != null && next.val == next.next.val) 
                    next = next.next;
                prev.next = next.next;
                curr = next.next;
                next = (next.next == null) ? null : next.next.next;
            }
        }
        return dummyhead.next;
    }
}
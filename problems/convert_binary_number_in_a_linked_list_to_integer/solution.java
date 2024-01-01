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
    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }
        
        int ans = 0;
        while (head.next != null) {
            ans = (ans + head.val) << 1;
            head = head.next;
        }
        
        if (head.val == 1) {
             ans = (ans + 1);
        }
        
        return ans;
    }
}
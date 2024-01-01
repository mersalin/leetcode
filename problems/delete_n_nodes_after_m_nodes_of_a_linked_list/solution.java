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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        
        ListNode node = head;
        ListNode prev = null;
        while(node != null) {
            int m1 = m;
            int n1 = n;
            
            while (m1 > 1 && node != null) {
                node = node.next;
                m1--;
            }
            prev = node;
            
            while (n1 >= 0 && node != null) {
                node = node.next;
                n1--;
            }
            
            if (prev != null) {
                prev.next = node;
            }
        }
        return head;
    }
}
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(0);
        ListNode node = head;
        int carry = 0;
        
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + carry;
            
            if ( val > 9) {
                carry = 1;
                val = val % 10;
            } else {
                    carry = 0;
            }
            node.next = new ListNode(val);
            l1 = l1.next;
            l2 = l2.next;
            node = node.next;
        }
        
        if (l1 == null) {
            while (l2 != null) {
                int val = l2.val + carry;
                if ( val > 9) {
                    carry = 1;
                    val = val % 10;
                } else {
                    carry = 0;
                }
                node.next = new ListNode(val);
                l2 = l2.next;
                node = node.next;
            }
        } else if (l2 == null) {
            while (l1 != null) {
                int val = l1.val + carry;
                if ( val > 9) {
                    carry = 1;
                    val = val % 10;
                } else {
                    carry = 0;
                }
                node.next = new ListNode(val);
                l1 = l1.next;
                node = node.next;
            }
        }
        
        if (carry > 0) {
            node.next = new ListNode(carry);
            node = node.next;
        }
        
        node.next = null;
        return head.next;
    }
    
    private ListNode reverse(ListNode node) {
        ListNode temp = null;
        ListNode prev = null;
        while (node != null) {
            temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
        return prev;
    }
}
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        
        int n = 0;
        ListNode node = head;
        ListNode tail = null;
        while (node != null) {
            tail = node;
            node = node.next;
            n++;
        }
        
        int r = n - (k % n);
        
        if (r%n == 0) {
            return head;
        }
        
        int index = 1;
        node = head;
        while (index < r) {
            node = node.next;
            index++;
        }
        ListNode temp = node.next;
        node.next = null;
        tail.next = head;
        head = temp;
        return head;
    }
}
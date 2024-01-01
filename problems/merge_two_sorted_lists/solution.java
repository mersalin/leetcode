class Solution {
ListNode head = new ListNode(0);
ListNode node = head;
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {	
	while (l1 != null || l2 != null) {
		if(l1 == null) {
			insert(l2.val);
			l2 = l2.next;
		} else if (l2 == null) {
			insert(l1.val);
			l1 = l1.next;
		} else if (l1.val < l2.val) {
			insert(l1.val);
			l1 = l1.next;
		} else if (l2.val < l1.val) {
			insert(l2.val);
			l2 = l2.next;
		} else {
			insert(l1.val);
			insert(l2.val);
			l1 = l1.next;
			l2 = l2.next;
		}
	}
        return head.next;
    }

	private void insert(int val) {
			node.next = new ListNode(val);
      node = node.next;
	}
}



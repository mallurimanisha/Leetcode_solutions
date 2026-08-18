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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode head = new ListNode(0);
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;
		ListNode t1 = head1;
		ListNode t2 = head2;
		ListNode t = head;
		while (t1 != null || t2 != null) {
			if (t1 == null) {
				while (t2 != null) {
					head.next = t2;
					head = head.next;
					t2 = t2.next;
				}
				break;
			}
			if (t2 == null) {
				while (t1 != null) {
					head.next = t1;
					head = head.next;
					t1 = t1.next;
				}
				break;
			}
			if (t1.val >= t2.val) {
				head.next = t2;
				head = head.next;
				t2 = t2.next;
			}
			else {
				head.next = t1;
				head = head.next;
				t1 = t1.next;
			}
		}
		return t.next;
	}
}

  
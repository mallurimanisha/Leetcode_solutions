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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode s=head;
        ListNode f=head;
        ListNode m=s;
        while(f!=null && f.next!=null){
            f=f.next.next;
            m=s;
            s=s.next;
        }
        m.next=m.next.next;
        return head;
    }
}
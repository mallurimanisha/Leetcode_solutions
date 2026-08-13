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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null || head.next==null) return head;
        int l=0;
        int c=1;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        int r=k%l;
        if(r==0) return head;
        ListNode nt=head;
        ListNode nh=nt.next;;
        while(c<l-r){
            c++;
            nt=nt.next;
        }
        ListNode m=nt.next;
        nh=nt.next;
        nt.next=null;
        while(m.next!=null){
            m=m.next;
        }
        m.next=head;
        return nh;
    }
}
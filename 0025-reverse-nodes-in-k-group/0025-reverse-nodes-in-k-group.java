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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int c=0;
        ListNode temp=head;
        ListNode tail=null;
        ListNode start=head;
        while(temp!=null){
            c++;
            if(c==k){
                ListNode next=temp.next;
                temp.next=null;
                ListNode nh=reverse(start);
                if(tail==null) head=nh;
                else tail.next=nh;
                tail=start;
                start=next;
                temp=next;
                c=0;
                continue;
            }
            temp=temp.next;
        }
        if(c>0) tail.next=start;
        return head;
    }
    public static ListNode reverse(ListNode head){
        ListNode temp=head;
        if(temp==null || temp.next==null) return head;
        ListNode back=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=back;
            back=temp;
            temp=front;
        }
        return back;
    }
}
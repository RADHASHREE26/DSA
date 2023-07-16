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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode temp=head;
        while(temp!=null && temp.next!=null)
        {
            ListNode t1=temp;
            while(t1!=null && t1.val==temp.val)
            {
                t1=t1.next;
            }
            temp.next=t1;
            temp=temp.next;
        }
        
        return head;
        
    }
}
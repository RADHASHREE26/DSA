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
    public boolean isPalindrome(ListNode head) {
        
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        
        ListNode rev=reverse(slow);
        ListNode temp=head;
        
        while(rev!=null)
        {
            if(temp.val!=rev.val)
                return false;
            rev=rev.next;
            temp=temp.next;
        }
        
        return true;
        
    }
    
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode next=null;
        
        while(head!=null)
        {
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        head=prev;
        return head;
    }
    
}
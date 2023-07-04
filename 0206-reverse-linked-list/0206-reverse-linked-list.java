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
    public ListNode reverseList(ListNode head) {
        
        ListNode temp=head;
        ListNode prev=null;
        ListNode next1=null;
        
        while(temp!=null)
        {
            next1=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next1;
        }
        
        head=prev;
        return head;
        
    }
}

/*
ListNode temp=head;
        ListNode prev=null;
        ListNode nex=null;
        while(temp!=null)
        {
            nex=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nex;
        }
        head=prev;
        return prev;
        */

/*
ListNode temp=null;
        
        while(head!=null)
        {
            ListNode nex=head.next;
            head.next=temp;
            temp=head;
            head=nex;
        }
        return temp;
        */
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0,head);
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        for(int i=1;i<=n;i++)
            fast=fast.next;
        
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;
        return dummy.next;
        
    }
}

/*

int len=0;
        ListNode node = head;
        while(node.next!=null)
        {
            len++;
            node=node.next;
        }
        
        if(len==1 && n==1)
            return new ListNode();
        
        int k=-1;
        
        node=head;
        
        while(node.next!=null)
        {
            k++;
            if(n==len-k)
            {
                node.next=node.next.next;
            }
            node=node.next;
        }
        
        return head;
        
        */
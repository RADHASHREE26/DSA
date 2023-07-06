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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode dummy1=new ListNode(0,null);
        ListNode dummy2=new ListNode(0,null);
        ListNode temp1=dummy1;
        ListNode temp2=dummy2;
        
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            if(c%2==1)
            {
                temp1.next=temp;
                temp1=temp1.next;
            }
            else
            {
                temp2.next=temp;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        
        temp1.next=dummy2.next;
        temp2.next=null;

        return dummy1.next;
        
    }
}